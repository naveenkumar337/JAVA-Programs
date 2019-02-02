import java.util.*;
public class evenorodd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		System.out.println("enter first  value for check even or not:");
		a=sc.nextInt();
		System.out.println("enter second value for check evn or not:");
		b=sc.nextInt();
		
		if((a%2 ==0) && (b%2 ==0)) {
			System.out.println("enter vaues are even");
		}
		else {
			System.out.println("both are not even values");
		}
		
		
		//ternary operation
		 String value=(a%2 ==0) ? "values is  even" : "value is not even";
		
		 System.out.println(value);
	}

}
