import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1330_compare_DongHyeonWoo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("두 수를 입력하시오. ex) 10 10 : ");
		
		String[] str = br.readLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		
		if(a > b) {
			System.out.println(">");
		}
		else if(a < b) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
		
	}

}
