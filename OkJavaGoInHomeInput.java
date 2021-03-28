import javax.swing.JOptionPane;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {

	// parameter, 매개변수
	public static void main(String[] args) {
		
		String room_num = args[0]; // Run Configuration에서 Arguments 활용
		String bright = args[1];
		
//		String room_num = JOptionPane.showInputDialog("Enter a Room num"); // input 창 띄우기
//		String bright = JOptionPane.showInputDialog("Enter a Bright level"); // input 창 띄우기
		
		// Elevator call
		Elevator myElevator = new Elevator(room_num);
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security(room_num);
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting(room_num + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(room_num + " / Floor Lamp");
		floorLamp.on();

		DimmingLights moodLamp = new DimmingLights(room_num + " moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
		/* JAVA APT 1004 -> Security off
		   JAVA APT 1004 / Hall Lamp -> Lighting on
		   JAVA APT 1004 / Floor Lamp -> Lighting on
		   JAVA APT 1004 moodLamp -> DimmingLights bright : 10.0
		   JAVA APT 1004 moodLamp -> Lighting on */
		
	}

}
