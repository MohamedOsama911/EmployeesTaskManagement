package etmswing;
import java.time.LocalDate;
import java.util.*;
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class Task implements Comparable<Task>{
    private DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-M-d");
    public String title;
    public String description;
    public int priority;
    public LocalDate assignedDate;
    public LocalDate endDate;    

    public Task(String title, String description, int priority, String assignedDate, String endDate) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.assignedDate = LocalDate.parse(assignedDate, dateFormat);
        this.endDate = LocalDate.parse(endDate, dateFormat);
    }
    
    public void editAssignDate(String assignedDate) {
        this.assignedDate = LocalDate.parse(assignedDate, dateFormat);
    }
    
    public void editEndDate(String endDate) {
        this.endDate = LocalDate.parse(endDate, dateFormat);
    }

    @Override
    public int compareTo(Task t) {
        if (priority < t.priority)                  // least required 
            return 1;
        else if (priority > t.priority)             // most required
            return -1;
        else                                        // priority == t.priority
        {
            if (endDate.isBefore(t.endDate)) {      
                return -1;                          // most required
            }
            else if (endDate.isAfter(t.endDate)){   
                return 1;                           // least required 
            }
            return 0;                               // endDate == t.endDate
        }
    }
}