//Distance Driving Problem by Tyler Najara
import java.util.Scanner; //The scanner we used in the other problems.

public class distancedrive {
    public static void main(String[] args) {
        System.out.println("Enter the driving distance: "); //Driving distance 
        Scanner ipt = new Scanner (System.in); //keeps track of input 1
        double a = ipt.nextDouble();
        
        System.out.println("Enter miles per gallon: "); //miles per gallon
        Scanner ipt2 = new Scanner(System.in); //keeps track of input 2
        double mile = ipt2.nextDouble(); 
        double b;
        b=(a/mile);
        
        System.out.println("Enter price per gallon: "); //price per gallon
        Scanner ipt3 = new Scanner(System.in); //keeps track of input 3
        double price = ipt3.nextDouble(); 
        double cost = Math.round(b*price*100.00)/100.00; //calc for cost
        System.out.println("The cost of driving is: $" + cost);  //the cost of driving
    }
}
