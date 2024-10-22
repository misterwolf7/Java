package defualtpakage;

class Greeting{
	// public, protected, default, private
	// public : 클래스 밖에서도 사용가능
	public static void hi() {
		System.out.println("Hi");	
	}
	
}
public class AccessLevelModifiersMethod {
	// private : 같은 클래스 안에서만 사용 가능
	private static void hello() {
		System.out.println("Hello");	
	}
	public static void main(String[] args) {
		Greeting.hi(); // Private : 같은 믈래스 안의 메소드를 사용하는 것임
		hello();
	}

}
