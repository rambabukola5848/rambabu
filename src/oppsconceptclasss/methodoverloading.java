package oppsconceptclasss;

public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		you can't create methods in a class same name.but you can crate same methods in class with different input parameters or with same input parameters
			//with different data types this is called method over loading.main method can also be over loading.
			// we cannot crate method in side new method
			//to call a noon static method in main class,we have to create the object of the class with the object reference we can call that method in to main
			//method.to create object,we have to use the class name and a object reference variable and with new operator.
			 methodoverloading obj1=new  methodoverloading ();
	       obj1.add();
	       obj1.add(10);
	       obj1.add(20);
	       obj1.add(10, 20);
		}
	 public void add(){
	 System.out.println("first method a");
	 
	}
	 public void add(int x) {
		System.out.println("second method");
		System.out.println(x);
	 }	 
	 
	public void add(int x,int y) {
		System.out.println("third method");
		System.out.println(x+y);
	}

	public void add(double z) {
		System.out.println();
	}
	}


