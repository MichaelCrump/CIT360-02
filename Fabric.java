import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Fabric {
public static void main(String[] args) {
    // TODO Auto-generated method stub
    Configuration cfg = new Configuration();
    cfg.configure("Hibernate.cfg.xml");
    SessionFactory sf = cfg.buildSessionFactory();
    Session s = sf.openSession();
    Transaction tx = s.beginTransaction();
    Fabric fab = new Fabric();
    fab.setId(2);
    fab.setName("Silk");
    fab.setDescription(101010);
    fab.setColor("White");
    s.save(fab);
    s.flush();
    tx.commit();
    s.close();
    }
}