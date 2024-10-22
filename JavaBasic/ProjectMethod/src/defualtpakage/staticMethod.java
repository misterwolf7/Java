package defualtpakage;
class Print{
	public String delimiter;
	
//	메소드에게 static 은 "클래스의 메소드이냐" / "인스턴스의 메소드이냐" 의 차이를 갖게 해주는 키워드이다.
//	static 이 붙은 클래스 메소드는 객체생성 없이 바로 「클래스명.메소드명()」으로 호출할 수 있고,
//	non-static인 인스턴스 메소드들은 객체를 생성함으로써 「인스턴스.메소드명()」으로 호출한다.
	// 메소드(a())가 인스턴스 소속일때는 static 없어야 됨
	public void a() {		
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	// 메소드(B())가 class 소속일때는 static 이 있어야 됨
	public static void b(String delimiter) {
		System.out.println(delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}

public class staticMethod {

	public static void main(String[] args) {
		// Print 클래스의 a(), b() 메소드 사용
//		Print.a("-");
//		Print.b("-");
		
		// t1 : Print 라는 클래스의 인스턴스
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		Print.b("*");
		


				
		
	}
}
