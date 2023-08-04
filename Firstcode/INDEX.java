package Firstcode;

public class INDEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer str=new StringBuffer("My name is Satyajeet Mohanty and i have two plus of yeears experience");
		
		System.out.println(str.indexOf("name"));
		System.out.println(str.lastIndexOf("Satyajeet"));
		System.out.println(str.indexOf("two", 12));

	}

}
