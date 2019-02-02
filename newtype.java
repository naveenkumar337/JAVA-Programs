/**
 *     *****
 *     ***
 *     *
 *     ***
 *     *****
 */

import java.util.*;
public class newtype {
	public static void main(String[] args) {
		int num=7;
		
		for(int i=num;i>=1;i=i-2) {
			for (int i1 = 1; i1 <= num; i1++) 
	        {
	            //Printing i spaces at the beginning of each row
	             
	            for (int j1 = 1; j1 < i1; j1++) 
	            {
	                System.out.print(" ");
	            }
	            //System.out.println(); 
	            }
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
				
			}
		
			System.out.println();
		}
for(int i=2;i<=num;i=i+2){
			for(int j=1;j<=i;j++){
			System.out.print("*");
	}
System.out.println();
	}
	}
}
