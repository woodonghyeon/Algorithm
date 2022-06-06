import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1001_AmB_Sc_DongHyeonWoo {
	
	public static void main(String[] args) throws IOException {
		// 기본적인 방법 (Scanner를 이용해 조건문만 달기)
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 두 개를 차례대로 입력하시오.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sub;
		
		if(a > b) {
			sub = a - b;
			System.out.println(a + " - " + b + " = " + sub);
		}
		else if(a < b) {
			sub = b - a;
			System.out.println(b + " - " + a + " = " + sub);
		}
		else {
			sub = 0;
			System.out.println("둘 다 같은 수 이므로 0");
		}
		
		// BufferReader, Writer를 사용해 공백으로 구분 짓기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수 두 개를 같이 입력해주세요. : 예) 15 15");
		
		String str = br.readLine();
		StringTokenizer stk = new StringTokenizer(str," ");
		
		int a = Integer.parseInt(stk.nextToken());
		int b = Integer.parseInt(stk.nextToken());
		int sub;
		
		if(a > b) {
			sub = a - b;
			System.out.println(a + " - " + b + " = " + sub);
		}
		else if(a < b) {
			sub = b - a;
			System.out.println(b + " - " + a + " = " + sub);
		}
		else {
			System.out.println("두 수가 같음, 결과 : 0");
		}
		
		// BufferReadr를 사용하고 split으로 공백 구분 짓기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수 두 개를 같이 입력해주세요. : 예) 15 15");
		
		String[] str = br.readLine().split(" ");
		
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int sub;
		
		if(a > b) {
			sub = a - b;
			System.out.println(a + " - " + b + " = " + sub);
		}
		else if(a < b) {
			sub = b - a;
			System.out.println(b + " - " + a + " = " + sub);
		}
		else {
			System.out.println("두 수가 같음, 결과 : 0");
		
		}
	}

}
