package JavaProgrammingPavan;

public class SWAPTWONUMBERS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Logic-1 (Using Third Variable)
		
		int a=50, b=60;
		
		System.out.println("Before Swapping two numbers"  + a + "  "+ b);
		//third variable
		/*int c=a; //c=50
		a=b;  //a=60
		b=c; //b=50
		System.out.println("After Swapping two numbers"  + a + "  "+  b); */
		
		//Logic-2 (Using Addition and Substraction without using third variable)
		
		/*a=a+b;  //50+60=110
		b=a-b;  //110-60=50
		a=a-b;  //110-50=60
		System.out.println("After Swapping two numbers"  + a + "  "+  b);  */
		
		//Logic-3(using Multiplication and division possible having number not zero)
		
		/*a=a*b; //50*60=3000;
		b=a/b; //3000/60=50;
		a=a/b; //3000/50=60;
		System.out.println("After Swapping two numbers"  + a + "  "+  b); */
		
		//Logic-4  (Using BITWISE Operator XOR)
		
		/*a=a^b; //50^60=
		b=a^b; //
		a=a^b;//
		
		System.out.println("After Swapping two numbers"  + a + "  "+  b); */
		
		
		//Logic-5  (Single statement (it is always execute right to left)
		b=a+b-(a=b); //( 110-60=50)
		System.out.println("After Swapping two numbers"  + a + "  "+  b);
		
		
		
		
		
		
		
		
		
		
		

	}

}
