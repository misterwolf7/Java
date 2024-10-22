package defualtpakage;

// instance : Class 의 복제본
// 복제본인데 가공할수있는 복제본을 만드는 것 
// 최종본 ->최종본 수정본 -> 진짜최종본 -> 찐진짜 최종본 -> 이게레알 울투라 최종본 -> ...
public class Instance {
	public static void main(String[] args) {
//		Instance 생성 -> "instance(객체)화 한다."
		// 1) new 를 호출한다
		// 2) Instance 하는 class 의 static 을 없앤다 
//		Print 라는 Class 다
		// 1) new 를 호출한다
		PrintInstance  p1 = new PrintInstance();
//		p1이라는 Instance 의 delimiter 가  ****
		p1.delimiter = "----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();

		PrintInstance  p2 = new PrintInstance();
//		p1이라는 Instance 의 delimiter 가  ****
		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
//		PrintInstance.delimiter = "****";
//		PrintInstance.A();
		// instance 로 같은 구문 출력
		p2.A();
		p1.A();
		p2.A();
		p1.A();
	}
}