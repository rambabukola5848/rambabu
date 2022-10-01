package oppsconceptclasss;

public class wrapperclassandcinversionconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="100";
		System.out.println(x+100);
		// data conversion:string to int;
		// we have wrapperclass for all  the data types  ie,,double,boolean integer
		//1.string to integer concept..

		Integer.parseInt(x);
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		System.out.println("end valu can check");
		//2.string to double conversion...
		String y="12.33";
		System.out.println(y+10);
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		//3.String to boolen conversion;
		String k="true";
		boolean b =Boolean.parseBoolean(k);
		System.out.println(b);
		//4.int to String conversion
		int j=200;
		System.out.println(j+20);
		String s=String.valueOf(j);
		System.out.println(s+20);
		String u="100";
		Integer.parseInt(u);
		///here java will number formet exception as this is not a
			}

		

	}


