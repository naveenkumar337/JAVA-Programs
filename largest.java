import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		 int n1,n2,n3;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter first value:");
		 n1=sc.nextInt();
		 System.out.println("enter second value:");
		 n2=sc.nextInt();
		 System.out.println("enter third value:");
		 n3=sc.nextInt();
		 
		 if(n1>=n2 && n1>=n3)
		 {
			 System.out.println(n1+" is big");
			 }
		 else if(n2>=n3 && n2>=n1) 
		 {
			 System.out.println(n2+" is big");
			 
		 }
		 else {
			 System.out.println(n3+" is big");
		 }
	}

}
