
public class MyOOP {
	
	public static String delimiter = ""; // 傈开 函荐 积己
	
	public static void main(String[] args) {
		
		delimiter = "----";
		printA();
		printA();
		printB();
		printB();
		
		delimiter = "****";
		printA();
		printA();
		printB();
		printB();


	}

	public static void printA() { // Method 积己
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public static void printB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}

}
