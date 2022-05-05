import java.util.Scanner;   //importing the use of a scanner 

public class interestApplication {
    public static void main(String[] args) {
    
        Scanner ui = new Scanner(System.in);
        System.out.println("Enter balance and rate: "); // Where the user inputs the info used  for  the code. 
        
        double bal = ui.nextDouble();
        double annualRate = ui.nextDouble()/100;
        ui.close();
        
        double interest = calcInterest(bal, annualRate)    // Math formula for interest that’ll be used below. 
        System.out.println("Your interest is:" + interest);
            }
    private static double calcInterest(double bal, double annualRate) {
        double interest = bal * (annualRate/12);
        return interest;     //This part is used to do the calculations for interest.
    } 
    } 
