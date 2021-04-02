class cal {
	
	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	// Overload : 자식이 아니어도 가능 (Overriding과 구분)
	public int sum(int v1, int v2, int v3) {
		return this.sum(v1, v2) + v3; // this.sum : 자기자신 클라스에 있는 sum을 나타냄
	}
	
}

class cal3 extends cal { // cal을 상속받은 cal3
	
	public int minus(int v1, int v2) {
		return v1 - v2;
	}
	// 부모 클라스의 성질을 바꾸는 자식 클라스 : Overriding
	public int sum(int v1, int v2) {
		System.out.println("cal3!!");
		return super.sum(v1, v2); // super.sum : 부모 클라스에 있는 sum을 나타냄
	}
	// Overload : 자식이 아니어도 가능 (Overriding과 구분)
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
