package StringInJava;

public class EqualsMethodOperaot {
	
	public static void main(String[] args) {
		String s1 = "ankita";
		String s2 = "sharma";
		String s6 = "sharma";

		String s3 = new String("ankita");
		String s5 = new String("ankita");
		String s4 = new String("sharma");
		String s7= "Ankita";
		int i =0;
		StringBuffer sb = new StringBuffer("hello");
		s7.concat("SHarma");
		System.out.println(s7);
		System.out.println(sb);
		sb.append("java");
		StringBuffer sv = new StringBuffer();
		sv = sb.append("sharma");
		System.out.println(sv.equals(sb));
		System.out.println(sb);
		
	
		
		// equals () method compares the original content of the string
		// == operator compares the reference of the string
		
		boolean a1 = s1.equals(s3);
		System.out.println(a1);

		System.out.println("1) " +s1.equals(s3)); // true
		System.out.println("2) " +s2.equals(s4)); // true
		System.out.println("3) " +(s1 == s2)); // false
		System.out.println("4) " +(s1 == s3)); // false
		System.out.println("5) " +(s3 == s5)); // false
		System.out.println("6) " +s3.equals(s5)); // True
		System.out.println("7) " +(s2 == s6)); // True
		System.out.println("8) " +s2.equals(s6)); // True
		System.out.println("9) " +s1.equals(s7)); //false
		System.out.println("10)" +s1.equalsIgnoreCase(s7)); //True
		System.out.println("11)" +(s1 == s7)); //false
		
		

	}

}
