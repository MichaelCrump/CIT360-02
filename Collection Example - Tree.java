import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class Fabric {

   public static void main(String args[]) {

      /* Declare TreeMap */
      TreeMap<Integer, String> tmap = 
             new TreeMap<Integer, String>();

      /*Add elements to TreeMap*/
      tmap.put(1, "Silk");
      tmap.put(2, "Satin");
      tmap.put(3, "Linen");
      tmap.put(4, "Wool");
      tmap.put(5, "Flannel");

      /* Display content using Iterator*/
      Set set = tmap.entrySet();
      Iterator iterator = set.iterator();
      while(iterator.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }

   }
}