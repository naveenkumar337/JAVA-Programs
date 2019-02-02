import java.util.*;
public class factrecursion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to check factorial value:");
		int num=sc.nextInt();
		int fact=1;
		int f=fact(num);
		System.out.println(f);
	}

	private static int fact(int num) {
		if(num==0||num==1)
			return 1;
		else
			return num*fact(num-1);
		//return 0;
	}
}
