package biit;

//import java.util.concurrent.TimeUnit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class KingRecords
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
    
    // Inserting a Record
    King king = new King();
    king.setLandName("Tishak");
    king.setLandOwner("Sishupati ji");
    
    LandPiece lp = new LandPiece();
    lp.setDistrict("Bhiloni district");
    
    lp.setKing(king); // lp ne king ko set kara
    king.setLandpiece(lp); // king ne lp ko set karliya
    
    ses.save(lp);
    ses.save(king);
    
    tr.commit();
    System.out.println("Records inserted successfully");
    
    ses.close();
    factory.close();
    }
} 
   