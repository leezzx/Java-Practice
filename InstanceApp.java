import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws IOException {
		
		PrintWriter p1 = new PrintWriter("result1.txt"); // PrintWriter : ����Ʈ����, p1 : PrintWriter�� instance, new�� ���� PrintWriter�� ������ ����
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 1");
		p2.close();
		
		// result1.txt, result2.txt ����
		
	}

}
