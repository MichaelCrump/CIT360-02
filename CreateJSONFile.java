import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreateJSONFile {
    
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("firstName", "Michael");
        obj.put("city", "Nephi");
        
        JSONArray list = new JSONArray();
        list.add("Java");
        list.add("JSP");
        list.add("Servlets");
        
        obj.put("customers", list);
        
        try(FileWriter file = new FileWriter("JSONCustomer.json"))
        {
            file.write(obj.toString());
            file.flush();
        }    
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        System.out.prinln(obj);
    }
    
}
