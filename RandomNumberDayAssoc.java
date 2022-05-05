// Random Number to Day Association by Tyler Najara
package randomforclass;
import java.util.Random;     //imported random number generator

public class Randomforclass {
   
    public static void main(String[] args) {
        int day = (int)(Math.random()*8);
        System.out.println("Here is a random number assigned to a day :" + day);
        System.out.println(weekdayName(day));
     //Here the code prints out the number and corresponding day.
    }
     public static String weekdayName(int day){
          String dayName = "";
        switch (day) {
            case 1: dayName = "Sunday"; break;      //All the cases below are days listed with the integers
            case 2: dayName = "Monday"; break;
            case 3: dayName = "Tuesday"; break;
            case 4: dayName = "Wednesday"; break;
            case 5: dayName = "Thursday"; break;
            case 6: dayName = "Friday"; break;
            case 7: dayName = "Saturday"; break;
            default:dayName = "Invalid day range";
     }
     return dayName;
}
}
