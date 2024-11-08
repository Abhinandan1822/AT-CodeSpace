package biit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class SelectRecord
{
    public static void main(String r[])
    {
    //Load hibernate configurations
    Configuration cfg=new Configuration().configure("/hibernate.cfg.xml");
    
    //create SessionFactory object
    SessionFactory factory=cfg.buildSessionFactory();
 
    //create hibernate Session object
    Session ses=factory.openSession();
 
    //there is no need to begin transaction in case of select
    Person ps = ses.get(Person.class, 1);
    if(ps!=null) {
    	System.out.println(ps.getId());
    	System.out.println(ps.getName());
    	System.out.println(ps.getCompany());
    	System.out.println(ps.getPass().getId());
    	System.out.println(ps.getPass().getCountry());
    }
    else {
    	System.out.println("Record Not Found");
    }
    
    ses.close();
    factory.close();
  }
} 