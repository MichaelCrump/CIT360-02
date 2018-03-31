package Calculate;

public class Addition implements doMath {
	public void execute(Integer input1, Integer input2){
		Integer addition = input1 + input2;
		System.out.println(addition);
	}
}