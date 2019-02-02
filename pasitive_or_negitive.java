import java.util.*;
public class pasitive_or_negitive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbere:");
		int num=sc.nextInt();
		
		if(num>0) {
			System.out.println(num+" is positive");
		}else if(num<0){
			System.out.println(num+" is nagitive");
			
		}else {
			System.out.println(num+" is zero");
		}
	}
}
