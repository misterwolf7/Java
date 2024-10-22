package InheritanceAppDefualt;

// Calculate 클래스 정의
class Calculate {
    int v1, v2;

    // 생성자 : Calculate 로 들어오는 애들이 int 일떄 사용
    Calculate(int v1, int v2) {
        System.out.println("Calculate init!!");
        // this 사용
        this.v1 = v1;
        this.v2 = v2;
    }

    // 더하기 메서드
    public int sum() {
        return this.v1 + this.v2;
    }
}

// extends : 상속 받을때 사용
// Calculate 클래스를 상속받는 Calculate3 클래스
class Calculate3 extends Calculate {

    // Calculate3 생성자
    Calculate3(int v1, int v2) {
        // super : 부모 클래스의 생성자를 실행
        super(v1, v2);
        System.out.println("Calculate3 init!!");
    }

    // 자식 클래스에는 : 빼기 메서드
    public int minus() {
        return this.v1 - this.v2;
    }
}

public class SuperExample {
    public static void main(String[] args) {
        // 부모 클래스의 인스턴스 생성
        Calculate c = new Calculate(2, 1);

        // 자식 클래스의 인스턴스 생성
        Calculate3 c3 = new Calculate3(2, 1);

        // sum() 메서드 호출
        System.out.println(c3.sum());   // 3 출력

        // minus() 메서드 호출
        System.out.println(c3.minus()); // 1 출력
    }
}

