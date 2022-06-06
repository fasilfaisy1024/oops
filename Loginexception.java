import java.util.Scanner;
class Invalid extends Exception {
    Invalid (String s) {
        super(s);
    }
}
public class Loginexception {
    public static void main(String args[]) {
        String user,pass;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter username : ");
            user = sc.nextLine();
            System.out.println("Enter password : ");
            pass = sc.nextLine();
            System.out.println();
            check(user, pass);
        }
        catch (Invalid e) {
            System.out.println(e);
        }
    }
    static void check(String user,String pass) throws Invalid {
        if(user.equals("Fasil") && pass.equals("Fasil@123"))
            System.out.println("Login Success");
        else
            throw new Invalid("Incorrect login credentials!");
    }
}