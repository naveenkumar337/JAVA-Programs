
public class swaptwovalues {

	public static void main(String[] args) {
		int a,b,temp;
		a=10;
		b=20;
		System.out.println("before swapring :a-->"+a+ "    b-->"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapring  :a-->"+a+ "    b-->"+b);
		
		System.out.println();
		int x,y,z;
		x=10;
		y=20;
		
		System.out.println("before swaping:x-->"+x+"   y-->"+y);
		x=x+y;//10+20=30
		y=x-y;//30-20=10
		x=x-y;//10-30=20
		System.out.println("afetr swaping:x-->"+x+"   y-->"+y);
		
		System.out.println();
		
		//swap to String values
		String str1,str2,temp1;
		str1="naveen";
		str2="kumar";
		System.out.println("before swapring :str1-->"+str1+ "    str2-->"+str2);
		temp1=str1;
		str1=str2;
		str2=temp1;
		System.out.println("after swapring  :str1-->"+str1+ "    str2-->"+str2);
		
	}

}
