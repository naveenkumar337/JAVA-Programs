public class checkisprime {
    public static void main(String args[]) {
        int number=34;
        boolean flag=false;
        for(int i=2;i<=number/2;i++) {
        	if(checkprime(i)) {
        		if(checkprime(number-i)) {
        			
        			System.out.printf("%d=%d+%d\n",number,i,number-i);
        			flag=true;
        		}
        	}
        	
        	
        }
        if(!flag)
        	System.out.println("not convert expression");
        
    }

	private static boolean checkprime(int num) {
		boolean isprime=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isprime=false;
				break;
			}
		}
		return isprime;
		//return false;
		
	}
}
