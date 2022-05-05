//Number to Day Association through User Input by Tyler Najara 
import java.util.Scanner;  //imported scanner
public class ifelsedays {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input Number: ");      //Here the message is displayed and the user
        int day = in.nextInt();                                 //will input a # to respond for a result.
        System.out.println(dayName(day));
    }
    public static String dayName(int day){
    String dayName = "";            //below are all the if and else statements to check which day is which #.
    if (day == 1){
        System.out.println("The day is Sunday");
    } else if (day == 2){
        System.out.println("The day is Monday");
    } else if (day == 3){
        System.out.println("The day is Tuesday");
    } else if (day == 4){
        System.out.println("The day is Wednesday");
    } else if (day == 5){
        System.out.println("The day is Thursday");
    } else if (day == 6){
        System.out.println("The day is Friday");
    } else if (day == 7){
        System.out.println("The day is Saturday");
    } else {
        System.out.println("Invalid Input");
    }
    return dayName;
}
}
