import java.util.Scanner;
public class lcm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n1 num:");
		int n1=sc.nextInt();
		int gcd=0;
		System.out.println("enter n2 num:");
		int n2=sc.nextInt();
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0  && n2%i==0)
				gcd=i;
		}
		int lcm1 = (n1 > n2) ? n1 : n2;
		System.out.println(lcm1);
		int lcm=(n1*n2)/gcd;
//		System.out.printf("gcd of %d and %d is %d ",n1,n2,gcd);
//		System.out.println();
		System.out.printf("lcm of %d and %d is %d ",n1,n2,lcm);
	}

}
