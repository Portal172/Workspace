package StringInJava;

public class ConcateCharaAt {

	public static void main(String[] args) {

		String s1 = "Test";
		String s2 = "Test2";
		System.out.println(s1.charAt(1));
		char a = s2.charAt(0);
		System.out.println(a);
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		s1 = s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2.concat(" Run"));
		String s3 = "Java Selenium TestNG";
		String[] split = s3.split(" ");
                System.out.println("Hello World");
		String [] split1 = s3.split("Selenium", 1);
		

		System.out.println("**************************************************************");

		for (String s : split) {
			System.out.println(s);
		}
		System.out.println("**************************************************************");
		for (String s11 : split1) {
			System.out.println(s11);
		}
		
	}

}
