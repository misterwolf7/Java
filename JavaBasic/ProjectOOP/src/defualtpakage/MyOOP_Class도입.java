package defualtpakage;

// 파일을 컴파일하게되면 자바는 소스파일의 이름과 똑같은 클래스를 찾아서 
// 그 클래스의 메인 메소드를 실행하도록 약속되어 있음
public class MyOOP_Class도입 {
	
	public static void main(String[] args) {
		Print.delimiter = "----";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
		
		Print.delimiter = "****";
		Print.A();
		Print.A();
		Print.B();
		Print.B();
	}
	
	
}