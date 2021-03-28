public class StringOperation {
	public static void main(String[] args) {
		System.out.println("Hello World".length()); // 11
		System.out.println("Hello, leezche ... bye".replace("leezche", "egoing")); // Hello, egoing ... bye
		
		// matches : 주어진 정규 표현식과 '정확히'일치하는지 여부를 확인하는 함수 = false
		String str = "my java test";
		// 정규표현식 사용 안할때 정확히 일치 해야함
		System.out.println(str.matches("java")); // false
		System.out.println(str.matches("my java Test")); // false
		System.out.println(str.matches("my java test")); // true
		// 정규표현식 사용
		System.out.println(str.matches(".*java.*")); // true
		System.out.println(str.matches("(.*)test")); // true	
	}
}
