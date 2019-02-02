
public class palindrome {

	public static void main(String[] args) {
		int num=121;
		int temp;
		int res=0;
		temp=num;
		while(num!=0) {
			int dev=num%10;
			res=res*10+dev  ;
			num=num/10;
			
		}
		if(temp==res) {
			System.out.println("pallindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
