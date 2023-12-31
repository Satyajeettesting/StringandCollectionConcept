package JavaProgrammingPavan;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		//Logic-1  (Using algorithm)
		
		/*int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;  //0+1234%10=4  40+3=43  430+2=432  4320+1=4321
			num=num/10;           //1234/10=123  123/10=12  12/10=1  1/10=0
		}
		
		System.out.println("Reverse number is "+ rev); */
		
		
		// Logic-2 (Using String Buffer class)
		
	 /*	StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		StringBuffer  rev=sb.reverse();
		System.out.println("Reverse number is "+ rev);  */
		
		//Logic-3 (Using String Builder)
		
		StringBuilder sbl=new StringBuilder();
		
		sbl.append(num);
		
		StringBuilder rev=sbl.reverse();
		System.out.println("Reverse number is "+ rev);
		

	}

}
