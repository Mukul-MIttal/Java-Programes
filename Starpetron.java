/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mukul.msc;

import java.util.Scanner;


public class Starpetron {
        public static void main(String[] args){
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		n = scan.nextInt();
		int space = n - 1;
	
		for (int i = 0; i < n; i++){
                    if(i%2==0){
			for (int j = 0; j < space; j++)
				System.out.print(" ");

			for (int j = 0; j <= i; j++)
				System.out.print("* ");
	
			System.out.print("\n");
                    }
			space--;
		}

		space = 1;
                if(n%2==0){
                n=n-1;
                space = 2;
                }
		for (int i = n-1; i > 0; i--){
                      if(i%2!=0){
			for (int j = 0; j < space; j++)
				System.out.print(" ");
	
			for (int j = 0; j < i; j++)
				System.out.print("* ");
	
			System.out.print("\n");
                      }
			space++;
		}
		
	}
}
