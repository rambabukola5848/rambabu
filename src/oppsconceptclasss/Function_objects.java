package oppsconceptclasss;


public class Function_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	      Function_objects a =new Function_objects();//one object will be created as new function in java
	      //and object is reference variable refer to this object,after creating object copy of all non static method will be
	      //given to this object.here below we can see the method test(),pqr(),qr(),division().. 
	      a.fuctions1();
	     a.fuctions1();
	      a.function3();
	      a.test();
	      a.pqr();
	      int k= a.pqr();
	      
		System.out.println(k);
		String p= a.qr();
		System.out.println(p);
		int x=a.division();
		System.out.println(x);
		double o=a.test(50, 50);
		System.out.println(0);
		}

		public void fuctions1 ()
		{System.out.println("this is written function 1");
		}
		public void function2() {
			System.out.println("this is written function 2");
	}
	public void function3(){

		System.out.println("this is written fuction3");
	}


	//3typs of methods
	//1.no input no out put 2.no input but out put 3.input and out put
	//void in the method names means does not return anything return type is void (means return no value)
	    public void test() {//no in put and no out put
		System.out.println("test method");

	}

	//(here pqr method is returning a value witch is c and the return is int)
	      public int pqr() {//no input but some out put
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
	  return c;
	      }
	     
	   // retun type is string
	  public String qr(){//no input some out put)    
	      System.out.println("qr method");
	      String s ="selenium";
	      return s;
	  }
	  //retun type is input
	  //x and y are inputs or input arguments
	  public int division() {//input and output
	System.out.println("divison method");
	int e=50;
	int d=64;
	int g=e+d;
	return d;
	  }

	  public double test(double x, double y) {
		 double r=x/y;
		 return r;
		 
	  }
	
		
		
	}


