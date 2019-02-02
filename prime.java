import java.util.*;
public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter low  number:");
			int low=sc.nextInt();
			System.out.println("enter high number:");
		int high=sc.nextInt();
		
		if(low>1) {
		while(low<high) {
			boolean flag=false;
		for(int i=2;i<=low/2;i++) {
			if(low%i==0) {
				flag=true;
				break;
				
			}
		}
			if(!flag)
				System.out.println(low);
			
			low++;
		}
		
		}
		else {
		System.out.println("low value must be greter then 1 .");}
	}
	//public class Prime {

//	    public static void main(String[] args) {
//
//	        int low = 2, high = 50;
//	        if(low>1) {
//	        while (low < high) {
//	            boolean flag = false;
//
//	            for(int i = 2; i <= low/2; ++i) {
//	                // condition for nonprime number
//	                if(low % i == 0) {
//	                    flag = true;
//	                    break;
//	                }
//	            }
//
//	            if (!flag)
//	                System.out.print(low + " ");
//
//	            ++low;
//	        }
//	        }
//	        else {
//	        	System.out.println("low must be greter then 1");
//	        }
//	    }
	}

