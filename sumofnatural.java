import java.util.*;
public class sumofnatural {

	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to check sum:");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("sum of natural number is:"+sum);
	}

}
