import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
        
/**
 *
 * @author mikec_000
 */
public class ReadJSONFile {
    
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        
        try
        {
            Object obj = parser.parse(new FileReader("JSONCustomers.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("name");
            System.out.println("Customer name is: " + name);
            
            String street = (String) jsonObject.get("street");
            System.out.println("Street address is: " + street);
        }
        catch(FileNotFoundException e) { e.printStackTrace(); }
        catch(IOException e) { e.printStackTrace(); }
        catch(ParseException e) { e.printStackTrace(); }
        catch(Exception e) { e.printStackTrace(); }
    }
}
