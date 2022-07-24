package etmswing;
import java.util.*;


public class Employee {
    public String email;
    public String password;
    public String name;
    public ArrayList<Task> list = new ArrayList<>();
    public ArrayList<Task> Finished_List = new ArrayList<>();
    
    Employee(String email, String password, String name, ArrayList<Task> list){
        this.email = email;
        this.password = password;
        this.name = name;
        this.list = list;
    }
    Employee(String email, String password, String name, ArrayList<Task> list, ArrayList<Task> Finished_List){
        this.email = email;
        this.password = password;
        this.name = name;
        this.list = list;
        this.Finished_List = Finished_List;
    }
    public void addTask(Task t)
    {
        list.add(t);
        Collections.sort(list);
    }
    
    
}
