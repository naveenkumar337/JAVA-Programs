/*
 * RECURSION: which method called it self is called recursion
 */
public class sumofnaturalusingrecursion {

	public static void main(String[] args) {
		int number=20;
		int sum=addsum(number);
		System.out.println(sum);
		}

	private static int addsum(int number) {
		if(number!=0)
			return number+addsum(number-1);// a method addsum(int number) is called itself addsum(number-1) is called recursion
			else
				return number;
		
		
	}

}
