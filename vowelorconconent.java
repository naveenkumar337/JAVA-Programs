/**
 * Java Program to Check Whether an Alphabet is Vowel or Consonant
 *
 */
import java.util.*;
public class vowelorconconent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//System.out.println("enter to check vowel or not:");
		//String str=sc.nextLine();
		char ch='b';
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
			System.out.println(ch+ " is vowel");
			
		}
		else {
			System.out.println(ch+ " is consonant");
		}
		

	}

}
