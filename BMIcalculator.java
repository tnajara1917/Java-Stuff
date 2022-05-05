//BMI Calculator by Tyler Najara

import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
    
        // The scanner will record information based on user input.
        Scanner qp = new Scanner(System.in);
        
        System.out.println("Input weight in pounds:"); // weight
        
        double weight = qp.nextDouble();
        
        System.out.println("Input height in feet:"); // height
        
        double height = qp.nextDouble();
        
        double bmi = weight / (height/weight);  //BMI calculator
        
        System.out.println("The BMI is " + bmi + "lbs/ft");
        
        //The Body Mass Index result displayed.
    }
}
