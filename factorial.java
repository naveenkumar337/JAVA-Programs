import java.util.*;
public class factorial {

	public static void main(String[] args) {
		 double fact=1;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter fact value to find");
		int num=sc.nextInt();
		 for(int i=1;i<=num;i++) {
			
			 fact=fact*i;
		 }
		 System.out.println(fact);

	}

}
