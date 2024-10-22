package defualtpakage;

public class C_OutputMethod {

	// String a() : a라는 메소드는 return값이 String이다.
	public static String a() {
		//...
		return "a";
	}
	// int one() : one이라는 메소드는 return값이 int이다.
	public static int one() {
		return 1;
		
	}
	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());
	}

}
