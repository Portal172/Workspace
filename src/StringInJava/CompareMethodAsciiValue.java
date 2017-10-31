package StringInJava;

public class CompareMethodAsciiValue {

	public static void main(String[] args) {
		
		String a = "Test";
		String b = "Test";
		String c = "Test1";
		int a2 = a.compareTo(b);
		System.out.println(a2);
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(c.compareTo(a));
		int a1 = (int) 'T';
		System.out.println(a1);
		
	}
}
