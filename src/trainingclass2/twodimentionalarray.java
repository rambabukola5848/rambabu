package trainingclass2;

public class twodimentionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[][]=new String[2][4];
System.out.println(s.length);
System.out.println(s[0].length);

    s[0][0] ="ramababu";
    s[0][1]="ravi";
    s[0][2]="prasad";
    s[0][3]="prasanna";
    
    s[1][0]="test";
    s[1][1]="north";
    s[1][2]="east";
    s[1][3]="south";
    System.out.println(s[1][2]);
    System.out.println("two dimensional matrix varibleher");
//we get the all the values print from two dimentional array
   for (int i=0;i<s.length;i++) {
	 for (int j=0;j< s[0] .length;j++){
		 System.out.println(s[i][j]);
		 
	 }
   }
	}
}


	


