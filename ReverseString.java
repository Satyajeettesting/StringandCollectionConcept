package JavaProgrammingPavan;


public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Logic-1(Using concatenation operator)
		 String str="Satyajeet";
		 String rev="";
		 
		/* int len=str.length();  //9
		 
		 for(int i=len-1;i>=0;i--) //8 7 6 5 4 3 2 1 -1 
		 {
			 rev=rev+str.charAt(i); //teejaytas
		 }
		 System.out.println("Reversed a string is:"+ rev); */
		 
		 //Logic-2  (Using Character Array)
		/*  char a[]=str.toCharArray();
		  
		 int len=a.length;
		 for(int i=len-1;i>=0;i--) //8 7 6 5 4 3 2 1 -1 
		 {
			 rev=rev+a[i];
		 }
		 System.out.println("Reversed a string is:"+ rev); */
		 
		 //Logic-3 (Using String Buffer class)
		 
		 StringBuffer sb=new StringBuffer(str);
		 
		System.out.println(sb.reverse());
		
		 
		 
		 
		 
		 
		 

	}

}
