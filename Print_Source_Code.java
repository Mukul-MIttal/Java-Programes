package mukul.msc;
import java.util.*;
import java.io.*;
public class Print_Source_Code {
    public static void main(String args[]){
        try{
            File file=new File("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mukul msc\\src\\mukul\\msc\\Print_Source_Code.java");
            Scanner scan=new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
}
