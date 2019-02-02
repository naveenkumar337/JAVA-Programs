import java.util.*;
public class print_n_to_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter how much elements you want");
		//int n=sc.nextInt();
		int[] a= {1,2,3,4,5,6,7,8};
		
//		System.out.println("enter array elements:");
//		for(int j=0;j<n;j++) {
//			
//			
//			a[j]=sc.nextInt();
//			
//		}
//		
		//print array elements
		for(int ele:a) {
			System.out.println(ele);
		}
		
		// descending order
		int temp;
		for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]<a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}					
				}			
		}
		//print descending order values
		System.out.println();
		for(int i1=0;i1<=a.length-1;i1++) {
			System.out.println(a[i1]);
		}
		
		//split an array
		int[] b=new int[a.length];
		int k=0;
		//System.out.println("enter to split at:");
		//int spli=sc.nextInt();
		for(int i2=0;i2<4;i2++) {
			b[k]=a[i2];
			k++;
		}
		int temp1;
		for(int i=0;i<k;i++) {
			for(int j=i+1;j<k;j++) {
				if(b[i]<b[j]) {
				temp1=b[i];
				b[i]=b[j];
				b[j]=temp1;
			}
				}
			
			System.out.println(b[i]);
		}
	}

}
