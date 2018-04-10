import java.util.Scanner;

public class UserLogin {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String user, pass;
        
        System.out.print("Enter your Username: ");
        user = input.nextLine();
        
        System.out.print("Enter your Password: ");
        pass = input.nextLine();
        
        if(user.equals("Michael") && (pass.equals("R0land"))){
            System.out.println("Welcome, Mr. Crump.");
        }else{
            System.out.println("Invalid Username or Password.");
        }
    }
}