package CollectionPractice;

import java.util.ArrayList;

public class ARRAYLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> ar= new ArrayList<Object>();
		
		ar.add(100);
		ar.add(700);
		ar.add(12.33);
		ar.add("testing");
		ar.add(true);
		System.out.println(ar);
		System.out.println(ar.get(3));
		//System.out.println(ar.get(5)); //o/p-java.lang.IndexOutOfBoundsException:
		System.out.println(ar.size());//Size of the index
		System.out.println("LI="+0);// Lowest Index
		System.out.println("HI="+(ar.size()-1));//Highest Index
		ar.add(900);
		ar.add(400);
		System.out.println(ar.size());
		

	}

}
