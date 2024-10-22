package defualtpakage;

// Class 만들기
// 이 소스코드 밖에 하나의 부품처럼 따로 저장가능
// Reactor -> Move type to new file
class PrintInstance{
	// 2) Instance 하는 class 의 static 을 없앤다 
	// 클래스의 멤버(변수(delimiter), 메소드(A(),B())
	// static 은 class 소속 -> static 뒤의 String 이 class 소속
	// instance 를 사용하기위해서는 static 을 지워야됨 => String delimiter 
	//=> ""은 더이상 PrintInstance 클래스의 소속이 아님
	// 클래스의 소속이 아니닌깐 PrintInstance 라는 Class 를 호출할 필요 없음
	public String delimiter = "";
		
	public void A() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public void B() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}