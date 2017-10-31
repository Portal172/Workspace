package StringInJava;

public class SIB_IIB {
	
	{
		System.out.println("i am from Non Static block");
	}
	
	{
		System.out.println("i am from Non Static block 1");
	}

	static {
		System.out.println("i am from Static block1");
	}
	
	static {
		System.out.println("i am from Static block2");
	}
	
	
	public SIB_IIB() {
		System.out.println("I am a constructor");
	}
	public static void main(String[] args) {
		SIB_IIB s1 = new SIB_IIB();
		SIB_IIB s2 = new SIB_IIB();
		

	}

}
