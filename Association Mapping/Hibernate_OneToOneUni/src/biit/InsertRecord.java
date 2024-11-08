package biit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class InsertRecord
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
    
    // insert a record
    Passport pass = new Passport();
    pass.setCountry("India");
    
    Person p1 = new Person();
    p1.setName("Abhinandan");
    p1.setCompany("Reliance");
    p1.setPass(pass);
    ses.save(p1);
    
    tr.commit();
    System.out.println("Records inserted suvvessfully");
    
    ses.close();
    factory.close();
    
    }
}

//  id--> 2 person se uthkar gayi pass_id mein as a foreign key
