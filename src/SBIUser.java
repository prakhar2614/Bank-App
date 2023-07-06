import java.sql.SQLOutput;
import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface{
    private String name;
    private String accountNumber;
    private double balance;
    private String password;
    private static double rateOfInterest;

    public SBIUser(String name, String password, double balance) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        rateOfInterest=6.5;
        this.accountNumber= String.valueOf(UUID.randomUUID());
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        SBIUser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance+=amount;
        return "Your updated balance is "+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance)return "Sorry bro you are broke";
            balance-=amount;
            return "Paisa aa gya";
        }
        else{
            return "Wrong Password";
        }
    }

    @Override
    public double calculateIntrest(int years) {
        double interest=balance*years*rateOfInterest/100;
        return interest;
    }
}
