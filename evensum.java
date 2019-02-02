import java.util.*;
public class evensum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int	sum1=0;
		
		System.out.println("enter how much elements you want");
		int n=sc.nextInt();
		int[] a=new int[n];
		
		System.out.println("enter array elements:");
		for(int j=0;j<n;j++) {
			
			
			a[j]=sc.nextInt();
			
		}
		System.out.println("element"+a);
		
//		for(int i=0;i<=a.length;i++) {
//			if(a[i]%2==0) {
//				//System.out.println(a[i]);
//				sum=sum+a[i];
//				//System.out.println(sum);
//			}
//			else {
//			//	System.out.println(a[i]);
//				sum1=sum1+a[i];
//			}
//			
//			//System.out.println(sum1);
//		}
//		System.out.println(sum);
//		System.out.println(sum1);
	}

}
