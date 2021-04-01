class print { // class�� ���� ������ Method ���, class �巡�� -> Refactor -> Move type to new file�� ���� class�� ������ �ڹ� ���Ϸ� ����
	
	public String delimiter = ""; // instance�� ���� ���� static ����(static�� class�� �Ҽ����� �ǹ��ϱ� ����)
	
	public print(String delimiter) { // class�� ���� �̸��� �Լ��� ���� ������ ����(�ʱ⿡ �Է��ؾ� �� ����)
		this.delimiter = delimiter; // this�� ���� �ν��Ͻ��� ������ ����
	}
	
	public void A() { // Method ����
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}
	
}

public class MyOOP2 {

	public static void main(String[] args) {
		
		print p1 = new print("----"); // instance + ������
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		print p2 = new print("****");
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
		p1.A();
		p2.A();
		p1.A();
		p2.A();
		
	}
	
}
