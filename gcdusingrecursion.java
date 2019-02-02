
public class gcdusingrecursion {

	public static void main(String[] args) {
		int num1=366,num2=66;
		int hfc=hcf(num1,num2);
		System.out.printf("hcf of %d and %d is %d",num1,num2,hfc);
		

	}
 
	public static int hcf(int num1, int num2) {
		if(num2!=0)
			return hcf(num2,num1%num2);
		else
		return num1;
	}

}
