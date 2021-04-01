class Foo {
	
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	
	public static void classMethod() {
		System.out.println(classVar); // Ok = I class var
//		System.out.println(instanceVar); // Error
	}
	
	public void instanceMethod() {
		System.out.println(classVar); // Ok = I class var
		System.out.println(instanceVar); // Ok = I instance var
	}
	
}

public class StaticApp {

	public static void main(String[] args) {
		
		System.out.println(Foo.classVar); // Ok = I class var
//		System.out.println(Foo.instanceVar); // Error
		Foo.classMethod(); // Ok = I class var
//		Foo.instanceMethod(); // Error
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // Ok = I class var
		System.out.println(f1.instanceVar); // Ok = I instance var
		
		f1.classVar = "changed by f1"; // class 내용을 바꾸어 버림
		System.out.println(Foo.classVar); // Ok = changed by f1
		System.out.println(f2.classVar); // Ok = changged by f1
		
		f1.instanceVar = "changed by f1"; // 해당 instance만 변경
		System.out.println(f1.instanceVar); // Ok = changed by f1
		System.out.println(f2.instanceVar); // Ok = I instance var

	}

}
