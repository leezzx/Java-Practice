class print { // class를 통해 변수와 Method 담기, class 드래그 -> Refactor -> Move type to new file를 통해 class를 별도의 자바 파일로 생성
	
	public String delimiter = ""; // instance로 쓰기 위해 static 삭제(static은 class의 소속임을 의미하기 때문)
	
	public print(String delimiter) { // class와 같은 이름의 함수를 통해 생성자 생성(초기에 입력해야 할 변수)
		this.delimiter = delimiter; // this를 통해 인스턴스와 생성자 구분
	}
	
	public void A() { // Method 생성
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
		
		print p1 = new print("----"); // instance + 생성자
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
