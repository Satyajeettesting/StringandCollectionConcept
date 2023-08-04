package CollectionPractice;

import java.util.ArrayList;

public class ARRAYLISTITERATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> Studentlist=new ArrayList<String>();
		
		Studentlist.add("Satyajeet");
		Studentlist.add("Abhijeet");
		Studentlist.add("Suryajeet");
		
		System.out.println(Studentlist);
		
		for(int i=0; i<Studentlist.size(); i++) {
		
		System.out.println(Studentlist.get(i));
		}
		
		System.out.println("------------");
		
		//foreach
		
		for(String s :Studentlist){
		
		
		System.out.println(s);
		
		}	

	}

	}
	

