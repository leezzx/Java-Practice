import org.opentutorials.iot.Elevator; // org 파일을 Progarmming 프로젝트에 복사하여 실행한 것
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome {

	public static void main(String[] args) {
		
		String room_num = "JAVA APT 507";
		
		// Elevator call
		Elevator myElevator = new Elevator(room_num);
		myElevator.callForUp(1); // 올라가는 목적의 Elevator 1층으로 호출
		
		// Security off
		Security mySecurity = new Security(room_num);
		mySecurity.off(); // Security 끄기
		
		// Light on
		// Light 치고 ctrl + space bar를 통해 필요한 함수 고를 수 있음 (import문 까지 자동 생성)
		Lighting hallLamp = new Lighting(room_num + " / Hall Lamp");
		hallLamp.on(); // hallLamp 켜기
		
		Lighting floorLamp = new Lighting(room_num + " / Floor Lamp");
		floorLamp.on(); // floorLamp 켜기
		
		/* JAVA APT 507 -> Elevator callForUp stopFloor : 1
		   JAVA APT 507 -> Security off
		   JAVA APT 507 / Hall Lamp -> Lighting on
		   JAVA APT 507 / Floor Lamp -> Lighting on */
		
	}

}
