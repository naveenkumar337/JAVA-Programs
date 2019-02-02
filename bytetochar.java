import java.util.*;
public class bytetochar {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	//	System.out.println("enter cahrecter:");
		//char[] b=sc.nextchar();
		//char c=(char)b;
		
		char ch='1';
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			System.out.println("it is alphabet");
		else
			System.out.println("not a alphabet");

	}

}
