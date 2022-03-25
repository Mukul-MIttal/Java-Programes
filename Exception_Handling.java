package mukul.msc;

import java.util.Scanner;

public class Exception_Handling {
public static void main(String args[]) throws MyException
    {
        try {
            Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter your Name.");
		String name = scan.nextLine();
                if(name.length()<5){
                throw new MyException("Please enter at least 5 character for name.");
                }
                for(int i=0;i<name.length();i++){
                    if(Character.isDigit(name.charAt(i))){
                    throw new MyException("Please don't use any numbers in name.");
                    }
                    if(!Character.isAlphabetic(name.charAt(i))){
                    throw new MyException("Please don't use any Special character in name.");
                    }
                }
         
                
            
        }
        catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
    }
}