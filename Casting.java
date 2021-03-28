public class Casting {
	public static void main(String[] args) {
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1; // 1을 실수 1.0으로 바꿈 : 손실 발생하지 않기 때문에 자동으로 바꿔줌
		System.out.println(b); // 1.0
		
//      int c = 1.1; 에러
		double d = 1.1;
		int e = (int) 1.1; // 1.1을 정수 1.0으로 바꿈 : 손실 발생하기 때문에 자동으로 바꿔주지 않음
		System.out.println(e); // 1
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass()); // class java.lang.String
	}
}
