public class Casting {
	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1; // 1�� �Ǽ� 1.0���� �ٲ� : �ս� �߻����� �ʱ� ������ �ڵ����� �ٲ���
		System.out.println(b); // 1.0
		
//      int c = 1.1; ����
		double d = 1.1;
		int e = (int) 1.1; // 1.1�� ���� 1.0���� �ٲ� : �ս� �߻��ϱ� ������ �ڵ����� �ٲ����� ����
		System.out.println(e); // 1
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass()); // class java.lang.String
	}
}
