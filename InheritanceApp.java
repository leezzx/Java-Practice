class cal {
	
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	// Overload : �ڽ��� �ƴϾ ���� (Overriding�� ����)
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2) + v3; // this.sum : �ڱ��ڽ� Ŭ�󽺿� �ִ� sum�� ��Ÿ��
	}
	
}

class cal3 extends cal { // cal�� ��ӹ��� cal3
	
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	// �θ� Ŭ���� ������ �ٲٴ� �ڽ� Ŭ�� : Overriding
	public int sum(int v1, int v2) {
		System.out.println("cal3!!");
		return super.sum(v1, v2); // super.sum : �θ� Ŭ�󽺿� �ִ� sum�� ��Ÿ��
	}
	// Overload : �ڽ��� �ƴϾ ���� (Overriding�� ����)
	public int sum(int v1, int v2, int v3, int v4) {
		return v1 + v2 + v3 + v4;
	}
	
}

public class InheritanceApp {

	public static void main(String[] args) {
		
		cal c = new cal();
		System.out.println(c.sum(2, 1)); // 3
		System.out.println(c.sum(2, 1, 1)); // 4
		
		cal3 c3 = new cal3();
		System.out.println(c3.sum(2, 1)); // call3!! 3
		System.out.println(c3.minus(2, 1)); // 1
		System.out.println(c3.sum(2, 1)); // cal3!! 3
		System.out.println(c3.sum(2, 1, 1, 1)); // 5
		
	}

}
