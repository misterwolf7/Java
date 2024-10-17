// org패키지 밑에 opentutorials페키지 밑에 iot라는 페키지 밑에 Elevator을 호출
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;

public class A_OkjavaGoinHome {

	public static void main(String[] args) {
		// Elevator call
		// Elevator : myElevator라는 변수의 타입
		// myElevator : 변수
		String id = "JAVA APT 507";
		
		Elevator myElevator = new Elevator (id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
				
		// Light on
		Lighting hallLamp = new Lighting (id+"JAVA APT 507 / Hall Lamp");
		hallLamp.on();
		Lighting floorLamp = new Lighting(id+"JAVA APT 507 / floorLamp");
		floorLamp.on();
		
		
	}

}
