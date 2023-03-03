package my.sd3;

/**
 *
 * @author Killian Daly
 */
public class Account {
    // Set up variables for superclass Account and methods, with private balance for security
    // and array for repeated interest earned over time
    int accountNo, time;
    private double balance; 
    double intRate, netInterest;
    double [] yearInterest = new double [time]; 
    
    public Account(int accountNo, double balance, int time, double intRate) {
        // Initialise account number, balance, timeframe and interest of superclass Account object
        this.accountNo = accountNo;
        this.balance = balance;
        this.time = time;
        this.intRate = intRate;
    }
    
    public void addFunds(double deposit) {
        // Add deposit to balance of specified object
        balance = balance + deposit;
    }
    
    public double getBalance() {
        // Return balance as separate double to protect balance variable 
        return balance;
    }
    
    public String euroFormat(double amount) {
        // Return double amount formatted as Euro currency
        String euroSum = "€" + String.format("%.2f", amount);
        return euroSum;
    }  
    
    public String accountInfo() {
        // Return string of labelled common attributes of subclass objects with linebreak
        String superBreakdown = "Account Number: " + accountNo +  "\n";
        return superBreakdown;
    }
}
