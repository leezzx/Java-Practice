import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("result1.txt"); // PrintWriter : 컨스트럭터, p1 : PrintWriter의 instance, new를 통해 PrintWriter의 복제본 생성
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 1");
		p2.close();
		
		// result1.txt, result2.txt 생성
		
	}

}
