package Calculate;
import java.util.HashMap;

public class Controller {
	public static HashMap<String, doMath> key = new HashMap <String, doMath>();
	
	public void Controller(){
		
	}
	
	public static void handleOperator(String operator, Integer input1, Integer input2){
		key.put("+", new Addition());
		key.put("-", new Subtraction());
		key.put("*", new Multiplication());
		key.put("/", new Division());
		
		doMath handler = key.get(operator);
		handler.execute(input1, input2);
		
	}
}