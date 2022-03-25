/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mukul.msc;

import java.util.*;

/**
 *
 * @author hp
 */
public class sort_string_by_words {
    public static void main(String args[]){
                ArrayList<String> L = new ArrayList<String>();
                Scanner scan = new Scanner(System.in);
		System.out.println("Please entern a string.");
		String s = scan.nextLine();
                StringTokenizer st = new StringTokenizer(s);
                while(st.hasMoreTokens()) {
                    L.add(st.nextToken());
                }
                Collections.sort(L);
                for(int j=0;j<L.size();j++){
                System.out.print(L.get(j));
                System.out.print(" ");
                }
    }
}
