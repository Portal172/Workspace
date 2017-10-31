package StringInJava;

public class StringExample1 {
	public static void main(String[] args) {
		
		/*
		 
		  Q.what is string:
		  1)string is a class.whenever we say its a class then we create the object of the class.
		  2)string is a set of charaters
		  3)String is immutable i.e, its cannot be changed its is final.
		  
		  Q. How to create string object?
		  there are two ways to create string object:
		  1)By String Literal
		  2)By new keyword
		  
		  String literal:
		  String s1= "Test1";
		  new keyword:
		  String s1 = new String ("Test1")
		 		 
		 */
		
		String s1= "ankitaank";
		
		s1.replace('a', ' ');
		System.out.println(s1);
		
		String s2= "sharma";
		String s3="ankita sharma";
		char ch2 = 'a';
		char [] ch ={'t','e','s','t'};
		String s4 = new String (ch);
		char [] ch1 ={'t','e','s','t','1'};
		String s5 = new String (ch1);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
//		String s6 = Character.toString(ch2);
//		String s7 = String.valueOf(ch1);
//		System.out.println(s6);
//		System.out.println(s7);
//	
		
		
		
		

	}
}
