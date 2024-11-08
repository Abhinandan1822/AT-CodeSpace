package tosh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class Select
{
    public static void main(String r[])
    {
    //Load hibernate configurations
    Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    
    //create SessionFactory object
    SessionFactory factory=cfg.buildSessionFactory();
 
    //create hibernate Session object
    Session ses=factory.openSession();
    
    Karamchari kc = ses.get(Karamchari.class, 5);
    if(kc!=null) {
    	System.out.println(kc.getId());
    	System.out.println(kc.getName());
    	System.out.println(kc.getCompany());
    	for(Kaam kaam: kc.getTasks()) {
    		System.out.println(kaam.getKaamName());
    	}
    }	
    else {
    		System.out.println("Records not found");
    }	
    	ses.close();
    	factory.close();
    }
}