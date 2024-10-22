package defualtpakage;

public class MyOOP {
	
	public static void main(String[] args) {
		
		delimiter = "----";
		printA(delimiter);
		printA(delimiter);
		printB();
		printB();
		
		delimiter = "****";
		printA(delimiter);
		printA(delimiter);
		printB();
		printB();
	}
	
	// delimiter 을 함수에서 직접 사용하기위해 전역 변수로 만들기
	public static String delimiter = "";
	// 함수 생성
	// 메개변수를 사용해서 구분자 
	public static void printA(String delimiter) {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	// 함수 생성
	private static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
