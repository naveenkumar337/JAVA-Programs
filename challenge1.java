/**
 * PRINT A OUTPUT LIKE: HI
 * 						HELLO
 * 						WORLD
 *
 */
public class challenge1 {

	public static void main(String[] args) {
		//normal method
		System.out.println("HAI\nHELLO\nWORDLD");
		
		//by using array
		String[] arr= {"HAI","HELLO","WORLD"};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}

	}

}
