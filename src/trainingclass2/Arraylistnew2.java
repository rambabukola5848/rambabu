package trainingclass2;

import java.util.ArrayList;

public class Arraylistnew2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//in array we have define the size first but for array it will dynamically assign the size as per the array count
		//we can provide any data type link int,string,char,double0,1,2,3,4
				//int j[] =new int [3];
				ArrayList good =new ArrayList();
				
			    good.add(100);//0 is the index
				good.add(200);//1 is the index
				good.add(300);//2 is the index
				System.out.println("the valu of index her storeis"+ good.get(2));
				
				System.out.println(good.size());
				good.add(400);//4 is the index
				good.add(500);//5 is the index
			
				good.add("test");//6is the index string
				// if you print the index value 6.you can give the method of this type of code.
				System.out.println("the valu of index her storeis"+ good.get(3));
			
				System.out.println("size of array list"+good.size());//+ is the string concardination
				
				good.add(25.5);//7th is the index//double
				good.add('a');// 8th is the index//char
				System.out.println("size of the array list"+good.size());
				
		//how i am delete the value 6th index .can check once 
				good.remove(7);
				System.out.println("size of array list "+good.size());
				for (int z=0;z<good.size();z++)
					System.out.println(good.get(z));
			System.out.println("good data");
			ArrayList bad=new ArrayList();
			bad.add("ram");//1
			bad.add(25);//2
			good.add(25.5);//3
			good.add('@');//4
		System.out.println("size of array list"+bad.get(1));
		}
	}


