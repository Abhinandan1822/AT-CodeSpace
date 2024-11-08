package sky;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class TestInsert
{
    public static void main(String r[])
    {
    //Load hibernate configurations
    Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    
    //create SessionFactory object
    SessionFactory factory=cfg.buildSessionFactory();
 
    //create hibernate Session object
    Session ses=factory.openSession();
 
    Transaction tr=ses.beginTransaction();
    
    //Inserting a Record
    Employee e = new Employee();
    e.setId(111);
    e.setName("Aman");
    
    Address add = new Address();
    add.setHouse("B block");
    add.setCity("New Delhi");
    add.setState("Rohtak");
    
    e.setHouse(add);
    
    //ses.persist(e);
    
    Integer id = (Integer)ses.save(e);
    System.out.println("Employee saved with Id: "+id);
    
    tr.commit();
    
    ses.close();
    factory.close();
    }
}    
    