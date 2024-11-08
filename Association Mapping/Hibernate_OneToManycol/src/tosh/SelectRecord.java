package tosh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class SelectRecord
{
    public static void main(String r[])
    {
    //Load hibernate configurations
    Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    
    //create SessionFactory object
    SessionFactory factory=cfg.buildSessionFactory();
 
    //create hibernate Session object
    Session ses=factory.openSession();
    
    // selecting a record
    Employee emp = ses.get(Employee.class, 1);
    if(emp!=null) {
    	System.out.println(emp.getId());
    	System.out.println(emp.getName());
    	System.out.println(emp.getCompany());
    	for(Tasks tasks: emp.getTasks()) {
    		System.out.println(tasks.getTaskName());
    	}
    }
    else {
    	System.out.println("Records not found");
    }
    
    
    ses.close();
    factory.close();
  }    
}