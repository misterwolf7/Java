package defualtpakage;

public class WhyMethod {
	// 메서드 생성.
	// void 아무것도 반환하지 않는다. => return값이 없을때 사용하면 됨.
	// main : 메소드
	// String[] : 문자열 형태의 배열
	// args : 자바가 기본적으로 가져오는 변수
	public static void main(String[] args) {
        
		// 메서드 단축키
		// refactor -> Extract
		// alt+shift+m
		printTwoTimesB();
		
		// "a", "-" : 인자, argument
		// printTwoTimesA메서드 사용
		printTwoTimesA("a", "-");
		//towTimes 메서드 사용
		System.out.println(towTimes("a", "-"));
		
		printTwoTimesA("b", "*");
		printTwoTimesA("c", "&");
   }
	
	public static String towTimes(String text, String delimiter) {
		String out = "";
		out += delimiter + "\n";
		out += text + "\n";
		out += text + "\n";
		return out;
		
	}
	public static void printTwoTimesB() {
		System.out.println("-");
		System.out.println("B");
		System.out.println("B");
	}
	// text, delimiter : 매개변수(parameter)
	// String : 매개변수의 Type
	public static void printTwoTimesA(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);

	}

	
}