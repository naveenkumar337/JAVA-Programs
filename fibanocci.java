
public class fibanocci {

	public static void main(String[] args) {
		int a=0,b=1,c;
		
		int fibnum=10;
		
		for(int i=1;i<=fibnum;++i) {
			System.out.println(a);//0 1 1 2 3 5 8 13 21 34
			c=a+b;     // 1  2 3 5 8 13 21 34 55
			a=b;      //  1  1 2 3 5 8  13 21 34
			b=c;      //  1  2 3 5 8 13 21 34 55
			
			
		}

	}

}
