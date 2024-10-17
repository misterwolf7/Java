// 파일 만들기
// PrintWriter는	페키지를 가져오는 작업을 해야됨 => import
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class B_InstamceApp {
	
	// ClassApp의 math클래스와의 차이점
	// Math클래스에는 construct(생성자)가 없다: 1회용
	// PrintWriter클래스에는 construct(생성자)가 있다. : 인스턴스를 만드는 것이 허용되어있다.
	// new를 사용해서 복제한 결과를 p1에 담음
	public static void main(String[] args) throws IOException {
		// PrintWriter의 복제본을 만드는 것
		// 그 복제본을 p1이라는 변수에 PrintWriter라는 클래스의 인스턴스를 저장
		// p1에는 반드시 PrintWriter 라는 클래스의 인스턴스만 들어간다 라는 뜻.
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p1.write("Hello 2");
		p1.close();
		
		// 인스턴스를 사용하지 않았을 때 => 계속 호출해야됨 => 비효율
//		PrintWriter.write("result1.txt", "Hello1");
//		PrintWriter.write("result2.txt", "Hello2");
//		PrintWriter.write("result1.txt", "Hello1");
//		PrintWriter.write("result2.txt", "Hello2");
//		PrintWriter.write("result1.txt", "Hello1");
//		PrintWriter.write("result2.txt", "Hello2");
//		PrintWriter.write("result1.txt", "Hello1");
//		PrintWriter.write("result2.txt", "Hello2");
	}
}
