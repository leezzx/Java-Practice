public class StringOperation {
	public static void main(String[] args) {
		System.out.println("Hello World".length()); // 11
		System.out.println("Hello, leezche ... bye".replace("leezche", "egoing")); // Hello, egoing ... bye
		
		// matches : �־��� ���� ǥ���İ� '��Ȯ��'��ġ�ϴ��� ���θ� Ȯ���ϴ� �Լ� = false
		String str = "my java test";
		// ����ǥ���� ��� ���Ҷ� ��Ȯ�� ��ġ �ؾ���
		System.out.println(str.matches("java")); // false
		System.out.println(str.matches("my java Test")); // false
		System.out.println(str.matches("my java test")); // true
		// ����ǥ���� ���
		System.out.println(str.matches(".*java.*")); // true
		System.out.println(str.matches("(.*)test")); // true	
	}
}
