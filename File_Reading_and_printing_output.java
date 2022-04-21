/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mukul.msc;
import java.util.*;
import java.io.*;
public class File_Reading_and_printing_output {
    public static void main(String args[]){
        int product=1;
        try{
            File input=new File("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mukul msc\\src\\mukul\\msc\\Input.txt");
            Scanner sc=new Scanner(input);
            while(sc.hasNextLine()){
                product*=Integer.parseInt(sc.nextLine());
            }
            
            FileWriter file2 = new FileWriter("C:\\Users\\hp\\Documents\\NetBeansProjects\\Mukul msc\\src\\mukul\\msc\\Output.txt");
            file2.write(String.valueOf(product));
            file2.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
