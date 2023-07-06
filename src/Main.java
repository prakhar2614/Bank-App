// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //create user
        System.out.println("Enter your name, password and balance");
        String name=sc.nextLine();
        String password=sc.next();
        double balance=sc.nextDouble();
        SBIUser user=new SBIUser(name,password,balance);

        // add money
        String msg=user.addMoney(100000);
        System.out.println(msg);

        //check balance
        user.checkBalance();

        // withdraw money
        System.out.println("Enter the amount you want to withdraw");
        int amt=sc.nextInt();
        System.out.println("Enter Password ");

        String pass=sc.next();
        System.out.println(pass);
        System.out.println(user.withdrawMoney(amt,pass));

        //calculate interest
        System.out.println(user.calculateIntrest(10));


    }
}