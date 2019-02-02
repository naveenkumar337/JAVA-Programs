import java.util.*;
public class countnumbers {
 public static void main(String[] args) {
	 int count=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter int values");
	 long num=sc.nextLong();
	 long reversed=0;
	while(num!=0) {
		long res=num%10;
		reversed=reversed*10+res;
		num=num/10;
		count++;
		
	}
	System.out.println("no.of numbers are:"+count);
	System.out.println(reversed);
	}
}
