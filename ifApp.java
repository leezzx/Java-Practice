
public class ifApp {

	public static void main(String[] args) {
		
		System.out.println("a"); // a
		if(false) {
			System.out.println(1);
		} else {
			if(true) {
				System.out.println(2); // 2
			} else {
				System.out.println(3);
			}
		}
		
		System.out.println("b"); // b
		if(false) {
			System.out.println(1);
		} else if(true) {
			System.out.println(2); // 2
		} else {
			System.out.println(3);
		}
		
	}

}
