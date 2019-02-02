
public class armstrong_using_function {

	public static void main(String[] args) {
		 int low=152,high=9999;
		for(int i=low+1;i<high;i++) {
			if(checkarmstrong(i)) {
				System.out.println(i);
			}
		}

	}

	private static boolean checkarmstrong(int num) {
		
			int digits=0;
			int res=0;
			int onum=num;
			while(onum !=0) {
				onum=onum/10;
				digits++;
			}
			onum=num;
			while(onum!=0) {
				int rem=onum%10;
				res=res+(rem*rem*rem);
				onum/=10;
				
			}
			if(res==num) {
				return true;
			}
		return false;
	}

}
