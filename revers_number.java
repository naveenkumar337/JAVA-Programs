import java.util.*;
public class revers_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		long num=sc.nextLong();
		long rem;
		long revnum=0;
		while(num!=0) {
			rem=num % 10;
			revnum=revnum*10+rem;
			num=num/10;
			
		}
		System.out.println(revnum);

	}

}
