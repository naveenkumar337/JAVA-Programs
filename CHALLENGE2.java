/**
 * write program for constructor chaining.
 * here,we call this mthod,by using this() we connect another constructor.
 * 
 *  
 *  
 *   Java program to illustrate Constructor Chaining 
// within same class Using this() keyword 
 * 
 * Rules of constructor chaining :

1.The this() expression should always be the first line of the constructor.
2.There should be at-least be one constructor without the this() keyword.
3.Constructor chaining can be achieved in any order.
*/
public class CHALLENGE2 {
	//initial block constructor
	{
		System.out.println("initial block");
	}
	//default constructor
	CHALLENGE2(){
		this(10);
		System.out.println("hai");
		
	}
	CHALLENGE2(int a,int b){
	
System.out.println(a*b);
	}
	CHALLENGE2(int x){
		this(1,2);
		System.out.println(x);
		
	}
	public static void main(String[] args) {
		new CHALLENGE2();
		System.out.println();
		System.out.println();
		
		//object creation for derived class
		derived obj=new derived("naveen");
	}
}



//constructor method for using inheritance
class base{
	String name;
	base(){
		this("");
		System.out.println("base-default");
		
	}
	base(String name){
		this.name=name;
		System.out.println("base-argument:"+name);
	}
}
class derived extends base{
	derived(){
		System.out.println("derived-default");
	}
	derived(String name){
		System.out.println("derived argument:"+name);
		}
}
