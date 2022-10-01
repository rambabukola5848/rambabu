package oppsconceptclasss;



public class Car {
	int mod;
	 int wheel;
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a= new Car();//now key words is used to creat a objects and a,b,c,are object reference variables
		
		//here now car();is the object and of car class and a,b,c is object reference and object variables are mod and wheel
			//we cant creat a duplicate class object reference names like using twice .we cant do)
			Car b=new Car();
			Car c=new Car ();
			a.mod=2015;
			a.wheel=4;
			b.mod=2014;//as mode is int typ+e here we are initializing the value to a.mod)
			b.wheel=4;
			c.mod=2013;
			c.wheel=6;
		System.out.println("before assignthe reference valu ");
			System.out.println("the model is"+a.mod);	
			System.out.println(a.wheel);
			
			System.out.println("the model is" +b.mod);
			System.out.println(b.wheel);
			System.out.println("the model is"+c.mod);
			System.out.println(c.wheel);
		///example-2
			System.out.println("ofter shifting reference valu");
			
			a=b;
			b=c;
			c=a;
			a.mod=10;
			System.out.println("the model is"+a.mod);
			System.out.println(a.wheel);
			System.out.println("next valu is clarity"+b.mod);
			System.out.println(b.mod);
			System.out.println(c.mod);
			c.mod=20;
			System.out.println("the model is"+a.mod);
			System.out.println(a.wheel);
			b.mod=30;
			System.out.println("the mosel is"+b.mod);
			System.out.println(b.wheel);
			System.out.println();
			System.out.println("the model is"+a.mod);
			
	 }
		
		
		

	}


