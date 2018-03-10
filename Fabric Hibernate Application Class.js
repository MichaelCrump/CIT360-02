import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageFabric {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      ManageFabric MF = new ManageFabric();

      /* Add fabric records in database */
      Integer fabricID1 = MF.addFabric("Silk", "White", 1);
      Integer fabricID2 = MF.addFabric("Satin", "Red", 1);
      Integer fabricID3 = MF.addFabric("Wool", "Grey", 1);

      /* List all the fabric */
      MF.listFabric();

      /* Update fabric records */
      MF.updateFabric(fabricID1, 5000);

      /* Delete a fabric from the database */
      MF.deleteFabric(fabricID2);

      /* List new list of fabric */
      MF.listFabric();
   }
   
   /* Method to CREATE a fabric in the database */
   public Integer addFabric(String type1, String type2, int size){
      Session session = factory.openSession();
      Transaction tx = null;
      Integer fabricID = null;
      
      try {
         tx = session.beginTransaction();
         Fabric fabric = new Fabric(type1, type2, size);
         fabricID = (Integer) session.save(fabric); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return fabricID;
   }
   
   /* Method to  READ all the fabric records */
   public void listFabric( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         List fabric = session.createQuery("FROM Fabric").list(); 
         for (Iterator iterator = fabric.iterator(); iterator.hasNext();){
            Fabric fabric = (Fabric) iterator.next(); 
            System.out.print("Type1: " + fabric.getType1()); 
            System.out.print("Type2: " + fabric.getType2()); 
            System.out.println("Size: " + fabric.getSize()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to UPDATE size for a fabric */
   public void updateFabric(Integer FabricID, int size ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Fabric fabric = (Fabric)session.get(Fabric.class, FabricID); 
         fabric.setSize( size );
		 session.update(fabric); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to DELETE a fabric from the records */
   public void deleteFabric(Integer FabricID){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Fabric fabric = (Fabric)session.get(Fabric.class, FabricID); 
         session.delete(fabric); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
}