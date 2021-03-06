/**
 * Created by ruthless on 2/4/17.
 */

import java.util.*;

public class Calendar {

        List<Event> sched;


    public Calendar() {

            sched=new ArrayList();
        }

        // Should allow multiple events to be scheduled over the same time window.
        public void schedule(Event event) {
            sched.add(event);
        }

        public List<ConflictedTimeWindow> findConflictedTimeWindow() {
            sched.sort(new Comparator<Event>() {
                @Override
                public int compare(Event o1, Event o2) {
                    return o1.startDate.compareTo(o2.startDate);
                }
            });
            List<ConflictedTimeWindow> conflictedTimeWindows=new ArrayList<>();
            for(int i=0;i<sched.size();i++)
            {
                Event currentEvent=sched.get(i);
                ConflictedTimeWindow window=null;
                HashSet<Integer> Ids=new HashSet<>();
                for(int j=i+1;j<sched.size();j++)
                {
                    Event nextEvent=sched.get(j);
                    if(currentEvent.endDate.compareTo(nextEvent.startDate)>0)
                    {
                        Ids.add(nextEvent.id);
                    }
                    else
                    {
                        break;
                    }
                }
                window=new ConflictedTimeWindow(currentEvent.startDate,currentEvent.endDate,Ids);
                conflictedTimeWindows.add(window);
            }
            return conflictedTimeWindows;
        }


        public static class ConflictedTimeWindow {
            private final Date startDate;
            private final Date endDate;
            private final Set<Integer> conflictedEventIds;

            public ConflictedTimeWindow(Date startDate, Date endDate, Set<Integer> conflictedEventIds) {
                this.startDate = startDate;
                this.endDate = endDate;
                this.conflictedEventIds = conflictedEventIds;
            }

            public Date getStartDate() {
                return startDate;
            }

            public Date getEndDate() {
                return endDate;
            }

            public Set<Integer> getConflictedEventIds() {
                return conflictedEventIds;
            }

            @Override
            public String toString() {
                return "ConflictedTimeWindow{" +
                        "startDate=" + startDate +
                        ", endDate=" + endDate +
                        ", conflictedEventIds=" + conflictedEventIds +
                        '}';
            }
        }

        public static class Event {
            private final int id;
            private final Date startDate;
            private final Date endDate;

            public Event(int id, Date startDate, Date endDate) {
                this.id = id;
                this.startDate = startDate;
                this.endDate = endDate;
            }

            @Override
            public String toString() {
                return "Event{" +
                        "id=" + id +
                        ", startDate=" + startDate +
                        ", endDate=" + endDate +
                        '}';
            }
        }

        public static void main(String[] args) {
            Calendar Calendar = new Calendar();

            Calendar.schedule(new Event(1, new Date(114, 0, 1, 10, 0), new Date(114, 0, 1, 11, 0))); // 2014-01-01 10:00 - 11:00
            Calendar.schedule(new Event(2, new Date(114, 0, 1, 11, 0), new Date(114, 0, 1, 12, 0))); // 2014-01-01 11:00 - 12:00
            Calendar.schedule(new Event(3, new Date(114, 0, 1, 12, 0), new Date(114, 0, 1, 13, 0))); // 2014-01-01 12:00 - 13:00

            Calendar.schedule(new Event(4, new Date(114, 0, 2, 10, 0), new Date(114, 0, 2, 11, 0))); // 2014-01-02 10:00 - 11:00
            Calendar.schedule(new Event(5, new Date(114, 0, 2, 9, 30), new Date(114, 0, 2, 11, 30))); // 2014-01-02 09:30 - 11:30
            Calendar.schedule(new Event(6, new Date(114, 0, 2, 8, 30), new Date(114, 0, 2, 12, 30))); // 2014-01-02 08:30 - 12:30

            Calendar.schedule(new Event(7, new Date(114, 0, 3, 10, 0), new Date(114, 0, 3, 11, 0))); // 2014-01-03 10:00 - 11:00
            Calendar.schedule(new Event(8, new Date(114, 0, 3, 9, 30), new Date(114, 0, 3, 10, 30))); // 2014-01-03 09:30 - 10:30
            Calendar.schedule(new Event(9, new Date(114, 0, 3, 9, 45), new Date(114, 0, 3, 10, 45))); // 2014-01-03 09:45 - 10:45

            List<ConflictedTimeWindow> conflictedTimeWindows = Calendar.findConflictedTimeWindow();
            System.out.println(conflictedTimeWindows);
            // should print something like
            // [ConflictedTimeWindow{startDate=Thu Jan 02 09:30:00 PST 2014, endDate=Thu Jan 02 10:00:00 PST 2014, conflictedEventIds=[5, 6]},
            //  ConflictedTimeWindow{startDate=Thu Jan 02 10:00:00 PST 2014, endDate=Thu Jan 02 11:00:00 PST 2014, conflictedEventIds=[4, 5, 6]},
            //  ConflictedTimeWindow{startDate=Thu Jan 02 11:00:00 PST 2014, endDate=Thu Jan 02 11:30:00 PST 2014, conflictedEventIds=[5, 6]},
            //  ConflictedTimeWindow{startDate=Fri Jan 03 09:45:00 PST 2014, endDate=Fri Jan 03 10:00:00 PST 2014, conflictedEventIds=[8, 9]},
            //  ConflictedTimeWindow{startDate=Fri Jan 03 10:00:00 PST 2014, endDate=Fri Jan 03 10:30:00 PST 2014, conflictedEventIds=[7, 8, 9]},
            //  ConflictedTimeWindow{startDate=Fri Jan 03 10:30:00 PST 2014, endDate=Fri Jan 03 10:45:00 PST 2014, conflictedEventIds=[7, 9]}]
        }

}
