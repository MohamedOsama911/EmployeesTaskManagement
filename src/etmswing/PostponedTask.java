/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etmswing;
import java.time.LocalDate;
import java.util.*;
import static etmswing.MainETM.empsList;
//import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

/**
 *
 * @author omar3
 */
public class PostponedTask {
//    private DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
    public String RequiredEndDate;  
    public String employeeEmail;
    public Task pTask;

    public PostponedTask(String RequiredEndDate, String employeeUsername, Task pTask) {
//        this.RequiredEndDate = LocalDate.parse(RequiredEndDate, dateFormat);
        this.RequiredEndDate = RequiredEndDate;
        this.employeeEmail = employeeUsername;
        this.pTask = pTask;
    }
}
