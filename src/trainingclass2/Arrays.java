package trainingclass2;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//Array=array is used to provide multiple values to same variable with same data type.
			//object array means to provide multiple data type inputs to samr array we can used to object array.
			//starting index or lower bond of the array will be o
			//highest bond or upper index of array will be n-1(where n is the valu of the array)..
			//1.how can you find out array lenth.system.out.printlen(j.length);
			//2.null array means ..you can give input number only 5 donnt give valu.error index out of bond error
			
			int j []=new int [4];//(dont incease the valu its called static array..we will incease the valu is called dyanamic arrays.)
			j[0]=10;
			j[1]=15;
			j[2]=20;
			j[3]=25;
			System.out.println(j[0]);
			System.out.println(j[3]);
			System.out.println(j.length);
	//double example.
			double k []= new double [3];//k[o]is called lower bond,upper bond meansk[2]
			k[0]=5;
			k[1]=8;
			k[2]=6;
		System.out.println(k[2]);
		//char example.
	char c[]=new char[3];
		char c1='6';
		char c2='7';
		char c3='8';	
				System.out.println(c1);
		for (int m =0; m <j.length;m++) {
		System.out.println(j[m]);
		}
				
	}

}
