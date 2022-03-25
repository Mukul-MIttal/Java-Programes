package mukul.msc;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
    public static void main(String[] arg) {
        System.out.println("Please enter 1st Word.");
        Scanner scan = new Scanner(System.in);  
        String a = scan.nextLine();
        System.out.println("Please enter 2nd Word.");
        String b = scan.nextLine();
        if(sortString(a).equals(sortString(b))){
            System.out.println("Input strings are anagrams.");
        }else{
           System.out.println("Input strings are not anagrams.");
        }
        
    }
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
