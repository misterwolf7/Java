package defualtpakage;

class PrintConstructor{

	public String delimiter = "";

	//instance 를 생성할때 delimiter 의 값을 생성하지 않으면 instance 화 되지 않는 코드
	// 생성자 생성 => 클래스의 이름과 똑같은 메소드를 정의하면 됨.(static,void,return datatype등 지정하지 않음)
	// 내가 인스턴스를 생성할떄 자바는 만약 new로 가져온 class와 같은 이름의 메소드가 있다면, 그 메소드를 호출 하도록 약속 되어있음.
	// PrintConstructor 라는 메소드의 매개변수 : _delimiter를 생성
	public PrintConstructor(String _delimiter) {
		
		// PrintConstructor 의 인스턴스 변수인 delimiter 에게 _delimiter 라는 생성자의 매개변수를 할당한다.
		// this :내가 생성한 인스턴스를 가리키는 이름 (클래스가 인스턴스화 되었을때의 인스턴스를 가리키는 특수한 이름이다.)
		// this.delimiter : 인스턴스의 delimiter변수를 의미하닌깐 String delimiter = "";를 의미
		this.delimiter = _delimiter;
	}
		
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}

	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
}
