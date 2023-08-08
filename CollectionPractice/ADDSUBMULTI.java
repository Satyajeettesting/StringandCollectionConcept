package CollectionPractice;

import java.util.Scanner;

public class ADDSUBMULTI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Need Scanner object to input the user
		Scanner scanner=new Scanner(System.in);
		//Enter a number
		System.out.println("Enter the number");
		//Read the users input and store in the number variable
		int number=scanner.nextInt();
		//Perform addtion substraction and multiplication
		//int number=5;
		//int number1=4;
		int addition=number+number;
		int substration=number-number;
		int Multiplication=number*number;
		//display the result of the add sub and mul
		System.out.println(addition);
		System.out.println(substration);
		System.out.println(Multiplication);
		//Close the scanner class
		//scanner.close();
		

	}

}
