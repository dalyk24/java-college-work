/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.sd3;

/**
 *
 * @author Killian Daly
 */
public class ProfessionalSaver extends Account {
    // Set variables to specific attributes of subclass object
    int time = 10;
    double intRate = .05, netInterest;
    double [] yearInterest = new double [time];
    
    public ProfessionalSaver(int accountNo, double balance, int time, double intRate) {
        // Inherit account number, balance, timeframe and interest from superclass Account object
        super (accountNo, balance, time, intRate);       
    }
    
    public void calculateInterest() {
        // Loop through yearInterest array for each year of bank account timeframe
        for (int i = 0; i < time; i++) {
            // Calculate x year interest then add it to balance for net sum, add it to net interest  
            // and add net sum to x array position
            yearInterest[i] = getBalance() * intRate;
            addFunds(yearInterest[i]);
            netInterest = netInterest + yearInterest[i];
            yearInterest[i] = getBalance();
        }       
    }
    
    public String accountInfo() {
        // Set up blank string variable so first loop doesn't store 'null' as string text
        String yearBreakdown = "";
        
        // Loop through yearInterest array for each year of bank account timeframe
        for (int i = 0; i < time; i++) {
            // Create string of array values with Euro formatting for each, appropriate year labels 
            // and linebreaks for breakdown of repeated interest over years
            yearBreakdown = yearBreakdown + "Year " + (i + 1) + " @ 5% APR = " + euroFormat(yearInterest[i]) + "\n";
        }
        
        // Create string of subclass common attributes, specfic attributes, interest over years and net
        // interest for breakdown of Account subclass object
        String accBreakdown = super.accountInfo() + "Account Type: Professional Saver" + "\n" + "Starting Balance: " + 
                euroFormat(getBalance() - netInterest) +  "\n" + yearBreakdown + "Total Interest Earned: " + 
                euroFormat(netInterest);
        
        // Return string breakdown of Account subclass object's banking details
        return accBreakdown;
    }
}
