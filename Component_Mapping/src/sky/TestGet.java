package sky;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class TestGet
{
    public static void main(String r[])
    {
    //Load hibernate configurations
    Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
    
    //create SessionFactory object
    SessionFactory factory=cfg.buildSessionFactory();
 
    //create hibernate Session object
    Session ses=factory.openSession();
 
    //there is no need to begin transaction in case of select
    Employee e = ses.get(Employee.class, 111);
    if(e!=null) {
    	System.out.println(e.getId());
    	System.out.println(e.getName());
    	System.out.println(e.getHouse().getHouse());
    	System.out.println(e.getHouse().getCity());
    	System.out.println(e.getHouse().getState());
    }
    else {
    	System.out.println("Record Not Found");
    }
    
    ses.close();
    factory.close();
    }
}
    
 