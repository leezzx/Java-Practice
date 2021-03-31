
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		
		System.out.println("Hi.");
		
		
		if(inputId.equals(id) && inputPass.equals(pass)) { // 원시 데이터 타입에서는 ==, 비원시 데이터 타입에서는 equals()
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}

	}

}
