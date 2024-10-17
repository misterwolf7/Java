// org패키지 밑에 opentutorials페키지 밑에 iot라는 페키지 밑에 Elevator을 호출
import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.DimmingLights;

public class A_OkjavaGoinHome_Input {

	// args : parameter(매게변수)
	// String[] : 문자열로 이루어져있는 배열
	public static void main(String[] args) {
		// Elevator call
		// Elevator : myElevator라는 변수의 타입
		// myElevator : 변수
		//showInputDialog : input문
		String id = args[0];
		String bright = args[1];
		
		Elevator myElevator = new Elevator (id);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
				
		// Light on
		Lighting hallLamp = new Lighting (id+ "Hall Lamp");
		hallLamp.on();
		Lighting floorLamp = new Lighting(id +"floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id+" moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}

}
