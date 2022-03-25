package mukul.msc;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] arg) {
        System.out.println("Please enter a year.");
        Scanner scan = new Scanner(System.in);  
        int year = scan.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("It's a leap year");
        }else{
            System.out.println("It's not a leap year");
        }
        
    }
}
