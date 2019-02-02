import  java.util.*;
public class linearsearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("enter no.of elements you want:");
		int n=sc.nextInt();
		int[] array=new int[n];
		System.out.println("enter elements :");
		
		for(int i=0;i<n;i++) {
			 array[i]=sc.nextInt();
		}
		System.out.println("enter search elemnet:");
		int search=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(search==array[i]) 
			{
				System.out.println(i);
			}
		}
		
			

	}

}
