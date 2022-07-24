package etmswing;

import java.awt.Window;
import java.time.LocalDate;
import java.util.*;
import javax.swing.JFrame;
import java.util.*;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter;

public class MainETM {

    static String Formicon="/icons/icons8-microsoft-to-do-app-192.png";
    static HashMap<String, Employee> empsList = new HashMap<>();
    static ArrayList<PostponedTask> postponedTasksList = new ArrayList<>();

    
    public static void main(String[] args) {
        // TODO code application logic here
//        intializeData();
        
        Task t1 = new Task("Task 1","Description 1", 5,"2022-6-9","2022-6-29");
        Task t2 = new Task("Task 2","Description 2", 2,"2022-1-30","2022-12-15");
        Task t3 = new Task("Task 3","Description 3", 8,"2022-1-29","2022-2-1");
        Task t4 = new Task("Task 4","Description 4", 5,"2022-3-14","2022-7-20");
        Task t5 = new Task("Task 5","Description 5", 5,"2022-4-18","2022-9-19");
        Task t6 = new Task("Task 6","Description 6", 5,"2022-2-22","2022-4-6");
        Task t7 = new Task("Task 7", "Description 7", 9, "2022-6-10", "2022-6-13");
        Task t8 = new Task("Task 8", "Description 8", 3, "2022-10-19", "2022-12-12");
        Task t9 = new Task("Task 9", "Description 9", 7, "2020-7-14", "2020-9-23");
        Task t10 = new Task("Task 10", "Description 10", 6, "2021-4-11", "2021-5-4");
        Task t11 = new Task("Task 11", "Description 11", 10, "2022-8-12", "2022-8-13");
        Task t12 = new Task("Task 12", "Description 12", 1, "2022-7-16", "2023-9-9");
        Task t13 = new Task("Task 13", "Description 13", 4, "2024-1-5", "2024-5-5");
        Task t14 = new Task("Task 14", "Description 14", 9, "2022-2-13", "2022-2-15");
        ArrayList<Task> list1 = new ArrayList<>();
        ArrayList<Task> list2 = new ArrayList<>();
        ArrayList<Task> list3 = new ArrayList<>();
        ArrayList<Task> list4 = new ArrayList<>();
        ArrayList<Task> list5 = new ArrayList<>();
        ArrayList<Task> list6 = new ArrayList<>();
        ArrayList<Task> list7 = new ArrayList<>();
        ArrayList<Task> list8 = new ArrayList<>();
        ArrayList<Task> list9 = new ArrayList<>();
        ArrayList<Task> list10 = new ArrayList<>();
        ArrayList<Task> list11 = new ArrayList<>();
        ArrayList<Task> list12 = new ArrayList<>();
        
        
        Employee emp1 = new Employee("1", "1", "Ali", list1);
        Employee emp2 = new Employee("emp2", "5678", "Osama", list2);
        Employee emp3 = new Employee("ahmed", "5678", "ahmed", list3);
        Employee emp4 = new Employee("mohamed", "5678", "mohamed", list4);
        Employee emp5 = new Employee("emad", "5678", "emad", list5);
        Employee emp6 = new Employee("ibrahim", "5678", "ibrahim", list6);
        Employee emp7 = new Employee("Mahmoud", "5678", "Mahmoud", list7);
        Employee emp8 = new Employee("omar", "5678", "omar", list8);
        Employee emp9 = new Employee("omda", "5678", "omda", list9);
        Employee emp10 = new Employee("test", "5678", "test", list10);
        Employee emp11 = new Employee("abdo", "5678", "abdo", list11);
        Employee emp12 = new Employee("june", "5678", "june", list12);
        emp1.addTask(t1);
        emp1.addTask(t2);
        emp1.addTask(t3);
        emp1.addTask(t4);
        emp1.addTask(t5);
        emp1.addTask(t6);
        emp1.Finished_List.add(t9);
        emp1.Finished_List.add(t10);
        emp2.addTask(t11);
        emp2.addTask(t7);
        emp4.addTask(t8);
        emp9.addTask(t12);
        emp10.addTask(t13);
        emp11.addTask(t14);
        
        empsList.put(emp1.email, emp1);
        empsList.put(emp2.email, emp2);
        empsList.put(emp3.email, emp3);
        empsList.put(emp4.email, emp4);
        empsList.put(emp5.email, emp5);
        empsList.put(emp6.email, emp6);
        empsList.put(emp7.email, emp7);
        empsList.put(emp8.email, emp8);
        empsList.put(emp9.email, emp9);
        empsList.put(emp10.email, emp10);
        empsList.put(emp11.email, emp11);
        empsList.put(emp12.email, emp12);
//        
        PostponedTask pt1 = new PostponedTask("2022-12-20", emp1.email, emp1.list.get(0));
        postponedTasksList.add(pt1);
        PostponedTask pt2 = new PostponedTask("2022-6-31", emp1.email, emp1.list.get(2));
        postponedTasksList.add(pt2);
        PostponedTask pt3 = new PostponedTask("2022-5-4", emp2.email, emp2.list.get(0));
        postponedTasksList.add(pt3);
        
        LoginForm l = new LoginForm();
        l.setResizable(false);
        l.setVisible(true);
       
    }
    
}
