package Firstcode;

public class ImmutableMutableReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Immutable
		String name="Satyajeet Mohanty";
		name="Satyajeet Swain";
		System.out.println(name);
		
		//Mutable
		StringBuffer Name=new StringBuffer("Satyajeet Mohanty");
		Name.replace(10, 17, "Swain");
		System.out.println(Name);
		//Reverse
		Name.reverse();
		System.out.println(Name);
		
	}

}
