package defualtpakage;

// Class 만들기
// 이 소스코드 밖에 하나의 부품처럼 따로 저장가능
// Reactor -> Move type to new file
class Print{
	// 클래스의 멤버(변수(delimiter), 메소드(A(),B())
	// static 은 class 소속 -> static 뒤의 String 이 class 소속
	public static String delimiter = "";
		
	public static void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public static void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}