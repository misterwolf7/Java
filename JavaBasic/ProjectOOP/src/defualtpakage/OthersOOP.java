package defualtpakage;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException  {
		
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		// Math 라는 클래스 안에 PI라는 변수가 존재
		System.out.println(Math.PI);
		//Math 라는 클래스 안에 floor 라는 메소드가 존재
		System.out.println(Math.floor(1.8));
		//Math 라는 클래스 안에 ceil 라는 메소드가 존재
		System.out.println(Math.ceil(1.8));
		// Math 의 floor ceil 같은 경우에는 내부적으로 어떠한 상태를 유지할 필요없음
		// (쓰고싶을때 쓰면되는 1회성)
		
		// new 로인해서 data.txt에다가 파일을 저장하겠다 라는 상태를 가지고있는 
		// FileWriter 이라는 class 의 복제본을 f1이라는 변수에 저장한 것.
		// 이것을 instance화 라고 한다잉.
		
		// FileWriter를 사용하기 위해서는 무조건 "data.txt"라는 수정하고자하는 대상인 파일이 지정이 되어있어야 됨.
		// 그 파일의 이름을 확정하는 행동을 까먹거나 나중에하면 문제가 생길수있음.
		// 따라서 instance 를 생성하는 시점에서 파일의 이름이 있어야 실행하게 할 수 있다.
		// 또는 FileWriter라는 함수를 사용하기위해서는 반드시 이루어져야하는 작업이 있다면 그작업을 실행하도록하는 것. 
		// 그리고 그작업에 필요한 부품이 부족하면 instance를 생성하지 못하게 하는 것.
		// 이것을 생성자라고 한다.
		FileWriter f1 =new FileWriter("data.txt");
		f1.write("hello");
		f1.write("Java");
		f1.close();
		
		FileWriter f2 =new FileWriter("data2.txt");
		f2.write("hello");
		f2.write("Java2");
		f2.close();
		
		f1.write("!!!");
		f1.close();
		// 계속적인 사용이 예상된다면, class 를 직접 사용하는 것이 아니라 class 를 복제해서 
		// f1,f2 라는 class의 복제본을 만들어서 제어한다.
		// 위작업을 "인스턴스(객체)화 한다"라고 정의
	}

}
