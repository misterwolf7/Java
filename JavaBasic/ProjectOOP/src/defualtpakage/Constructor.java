package defualtpakage;

public class Constructor {
    public static void main(String[] args) {
    	// 생성자 : 특수한 메소드를 구현하는 기능을 제공함 => 초기화
    	// FileWriter를 사용하기 위해서는 무조건 "data.txt"라는 수정하고자하는 대상인 파일이 지정이 되어있어야 됨.
		// 그 파일의 이름을 확정하는 행동을 까먹거나 나중에하면 문제가 생길수있음.
		// 따라서 instance 를 생성하는 시점에서 파일의 이름이 있어야 실행하게 할 수 있다.
		// 또는 FileWriter라는 함수를 사용하기위해서는 반드시 이루어져야하는 작업이 있다면 그작업을 실행하도록하는 것. 
		// 그리고 그작업에 필요한 부품이 부족하면 instance 를 생성하지 못하게 하는 것.
    	
    	// 생성자를 사용해서
    	// instance 를 생성할때 delimiter 의 값을 생성하지 않으면 instance 화 되지 않는 코드
    	PrintConstructor p1 = new PrintConstructor("----");
        p1.A();
        p1.B();
        PrintConstructor p2 = new PrintConstructor("****");
        
        
        p2.A();
        p2.B();
    }
}