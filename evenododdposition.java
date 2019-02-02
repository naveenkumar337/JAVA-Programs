import java.util.*;
public class evenododdposition {

	public static void main(String[] args) {
		int[] a=new int[100];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size os elements");
		int n=sc.nextInt();
		System.out.println("enter elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("even numbers are:");
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				System.out.printf("%d at position of %d",a[i],i);
			}
			System.out.println();
//			else {
//				System.out.println(i);
//			}
		}
		System.out.println("odd numbers are:");
		for(int i=0;i<n;i++) {
			if(a[i]%2!=0) {
				System.out.printf("%d at position of %d",a[i],i);
			}
			System.out.println();
		}
	}

}
