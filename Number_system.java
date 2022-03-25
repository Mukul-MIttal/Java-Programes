package mukul.msc;
import java.util.Scanner;
public class Number_system {
     public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any decimal number :");
        int num = scan.nextInt();
        String hexa = Integer.toHexString(num);
        System.out.println("HexaDecimal Value is : " + hexa);
        String octal = Integer.toOctalString(num);
        System.out.println("octal value is :" + octal);
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary Value is : " + binary); 
    }
}
