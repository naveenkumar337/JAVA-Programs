import java.util.*;
public class leapyear {
	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year to check leap year:");
		year=sc.nextInt();
		
		if(year%4==0) {
		System.out.println("year-->"+year+" is leap year");
		}
		else if(year%400==0) {
			System.out.println("year-->"+year+" is leap year");

		}
		else if(year%100==0) {
			System.out.println("year-->"+year+" is leap year");

		}
		else {
			System.out.println("year-->"+year+" is not leap year");
		}
		
		
	}

}
