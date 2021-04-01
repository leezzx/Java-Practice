import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
										   // 예외 처리
	public static void main(String[] args) throws IOException {
		
		// class = System, Math, FileWriter
		System.out.println(Math.PI); // 3.141592653589793
		System.out.println(Math.floor(1.8)); // 1.0
		System.out.println(Math.ceil(1.8)); // 2.0
		
		// instance = f1, f2
		FileWriter f1 = new FileWriter("data.txt"); // 파일에 내용 기록하는 함수 = data.txt 파일 생성
		f1.write("Hello");
		f1.write("JAva");
		
		FileWriter f2 = new FileWriter("data2.txt"); // data2.txt 파일 생성
		f2.write("Hello");
		f2.write("JAva2");
		f2.close();
		
		f1.write("!!!");
		f1.close(); // 파일 작성을 끝낸다는 뜻

	}

}
