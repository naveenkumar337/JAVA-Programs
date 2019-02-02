/**
 * 
 */

/**
 * @author LENOVO
 *
 *
 */
import java.util.*;
public class powerofnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num,base value");
		//System.out.println("enter base value");
		int num=sc.nextInt(),base=sc.nextInt(),res=1;
		while(base!=0) {
			res=res*num;
			base--;
		}
		System.out.println(res);

	}

}
