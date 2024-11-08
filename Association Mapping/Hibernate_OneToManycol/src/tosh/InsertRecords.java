package tosh;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecords
{
    public static void main(String r[])
    {
        // Load hibernate configurations
        Configuration cfg = new Configuration().configure("/hibernate.cfg.xml");
        
        // Create SessionFactory object
        SessionFactory factory = cfg.buildSessionFactory();
     
        // Create hibernate Session object
        Session ses = factory.openSession();
     
        Transaction tr = ses.beginTransaction();
        
        // Insert a Record
        Tasks task1 = new Tasks();
        task1.setTaskName("Analysis of Hibernate Uses");
        Tasks task2 = new Tasks();
        task2.setTaskName("Analysis of SpringBoot Uses");
        Tasks task3 = new Tasks();
        task3.setTaskName("Uses of Operating System");
        
        List<Tasks> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        
        Employee emp = new Employee();
        emp.setName("Toshiba");
        emp.setCompany("SpiceJet");
        emp.setTasks(tasks);
        ses.save(emp);
        
        tr.commit();
        System.out.println("Records inserted successfully");
        
        ses.close();
        factory.close();
    }
}
