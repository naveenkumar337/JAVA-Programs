import java.util.*;
import java.io.*;
public class charecter_fibonacci {
	public static void main(String[] args) {
		
	
	char[] al=new char[26];
	for(char ch='a';ch<'z';ch++) {
	
		al[ch-'a']=ch;
		/**
		 * means ch=97,a=97-->  97-97=0-->  al[0]=a;  al[0] place a will be store 
		 * ch=98(b),a=97--> 98-97=1--> al[1]=b;		 al[1] place b will be store*/
		
			
		}

	int a=0,b=1,c;
	for(int i=1;i<=9;++i) {
		System.out.println(al[a]);//0 1 1 2 3 5 8 13 21 34
		c=a+b;     // 1  2 3 5 8 13 21 34 55
		a=b;      //  1  1 2 3 5 8  13 21 34
		b=c;      //  1  2 3 5 8 13 21 34 55
		
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
