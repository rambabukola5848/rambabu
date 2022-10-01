package oppsconceptclasss;


public class ststicandnonstaticjava {

//global variables can be used across all the functions with limitation.
	int a=20;//non static variable
	static String name="ram";// static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ststicandnonstaticjava obj1=new ststicandnonstaticjava();
		
		obj1.add();
		
		System.out.println(obj1.a);
		
// 2.two ways to call static methods
		//1.by name
		test();
		// call by class name
		ststicandnonstaticjava.test();
	//static variables can be call directly directly	
		System.out.println(name);
		System.out.println(obj1.name);
	}

	public void add() {//non static method 
		System.out.println("1st method");
		
	}
	public static void test() {//static method
		System.out.println("2nd method");
	}
	
	
	


	}


