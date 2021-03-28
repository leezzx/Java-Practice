import org.opentutorials.iot.Elevator; // org ������ Progarmming ������Ʈ�� �����Ͽ� ������ ��
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome {

	public static void main(String[] args) {
		
		String room_num = "JAVA APT 507";
		
		// Elevator call
		Elevator myElevator = new Elevator(room_num);
		myElevator.callForUp(1); // �ö󰡴� ������ Elevator 1������ ȣ��
		
		// Security off
		Security mySecurity = new Security(room_num);
		mySecurity.off(); // Security ����
		
		// Light on
		// Light ġ�� ctrl + space bar�� ���� �ʿ��� �Լ� �� �� ���� (import�� ���� �ڵ� ����)
		Lighting hallLamp = new Lighting(room_num + " / Hall Lamp");
		hallLamp.on(); // hallLamp �ѱ�
		
		Lighting floorLamp = new Lighting(room_num + " / Floor Lamp");
		floorLamp.on(); // floorLamp �ѱ�
		
		/* JAVA APT 507 -> Elevator callForUp stopFloor : 1
		   JAVA APT 507 -> Security off
		   JAVA APT 507 / Hall Lamp -> Lighting on
		   JAVA APT 507 / Floor Lamp -> Lighting on */
		
	}

}
