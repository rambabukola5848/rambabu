package oppsconceptclasss;



public class localandgloblevariables {
	  int age=20;
	  String name="Rambabu";//we can use whole entire method its called as global variables.
	public static void main(String[] args) {//local variables limited only for this main method.
		// TODO Auto-generated method stub
		int a=10;//we can use this method dont use another method is called as local variables
		int b=20;
		///like example_1 int a=30,suppose we create another methods
		localandgloblevariables obj1= new localandgloblevariables();
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		System.out.println(obj1.adding());
		System.out.println(obj1.String2());
		}
		public String String2 () {
		String s="ram";
		String k="prasanna";
			String D="s+k";
			return k;
			
		}
	 public int adding() {//Local variables limited till this method only)..
		int a=40;
		int b=50;
		int c=a+b;
		return c;
	 }
	

	}


