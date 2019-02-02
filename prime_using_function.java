	import java.util.Scanner;
public class prime_using_function {



		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		System.out.println("enter low  number:");
				int low=sc.nextInt();
				System.out.println("enter high number:");
			int high=sc.nextInt();
			
			
			while(low<high) {
				if(checkprime(low)) 
					System.out.println(low);
				
				low++;
			
			}
		}
			//boolean checkprime(int num) {
				

		public static boolean checkprime(int low) {
			boolean flag=true;
			for(int i=2;i<=low/2;i++) {
				if(low%i==0) {
					flag=false;
					break;
					
				}
			}
		
			return flag;
			
			}
			
			//return false;
		
}


