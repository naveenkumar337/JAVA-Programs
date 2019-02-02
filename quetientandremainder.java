/**
 * Compute Quotient and Remainder
 */
import java.util.Scanner;
public class quetientandremainder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter devident values");
		int Devident=sc.nextInt();
		System.out.println("enter devisor value:");
		int devisor=sc.nextInt();
		
		float quotient=Devident/devisor;
		int remainder=Devident%devisor;
		System.out.println("quotient is:"+quotient);

		System.out.println("quotient is:"+remainder);

	}

}
