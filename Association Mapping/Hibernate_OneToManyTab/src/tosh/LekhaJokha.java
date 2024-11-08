package tosh;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LekhaJokha {
	 public static void main(String r[])
	    {
	        // Load hibernate configurations
	        Configuration cfg = new Configuration().configure("/hibernate.cfg.xml");
	        
	        // Create SessionFactory object
	        SessionFactory factory = cfg.buildSessionFactory();
	     
	        // Create hibernate Session object
	        Session ses = factory.openSession();
	     
	        Transaction tr = ses.beginTransaction();
	        
            // Inserting a record
	        Kaam k1 = new Kaam();
	        k1.setKaamName("Read OOPS file");
	        Kaam k2 = new Kaam();
	        k2.setKaamName("Know about collections");
	        Kaam k3 = new Kaam();
	        k3.setKaamName("Learn Hibernate");
	        
	        List<Kaam> tasks = new ArrayList<>();
	        tasks.add(k1);
	        tasks.add(k2);
	        tasks.add(k3);
	        
	        
	        Karamchari kc = new Karamchari();
	        kc.setName("Toshiba");
	        kc.setCompany("I2a Solutions");
	        kc.setTasks(tasks);
	        ses.save(kc);
	        
	        Karamchari kc1 = new Karamchari();
	        kc.setName("Maira");
	        kc.setCompany("IGT Solutions");
	        kc.setTasks(tasks);
	        ses.save(kc1);
	        
	        tr.commit();
	        System.out.println("Records are inserted successfully");
	        
	        ses.close();
	        factory.close();
         }
}