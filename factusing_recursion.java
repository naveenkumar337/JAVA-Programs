
public class factusing_recursion {

	public static void main(String[] args) {
		int num=4;
		int res=fact(num);
		System.out.println(res);
		
	
	}

	

	private static int fact(int num) {
		int res=1;
		if(num!=0) 
			return res=num*fact(num-1);
		else
			return 1;
	
	}

}
