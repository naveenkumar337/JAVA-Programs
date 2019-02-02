

public class armstrong {

	public static void main(String[] args) {
		
		int num=153;
		int temp;
		temp=num;
		int rem;
		int res=0;   
		while(num!=0) {
			rem=num%10;
			res=res+(rem*rem*rem);
			num /= 10;
		}
		if(temp==res) {
			System.out.println("armstrong number");
			
		}
		else {
			System.out.println("not armstrong");
		}
		
		
	}
		

}
