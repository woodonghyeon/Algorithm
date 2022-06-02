import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1001_AmB_Sc_DongHyeonWoo {
	
	public static void main(String[] args) throws IOException {
		// �⺻���� ��� (Scanner�� �̿��� ���ǹ��� �ޱ�)
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �� ���� ���ʴ�� �Է��Ͻÿ�.");
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
			System.out.println("�� �� ���� �� �̹Ƿ� 0");
		}
		
		// BufferReader, Writer�� ����� �������� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���� �� ���� ���� �Է����ּ���. : ��) 15 15");
		
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
			System.out.println("�� ���� ����, ��� : 0");
		}
		
		// BufferReadr�� ����ϰ� split���� ���� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���� �� ���� ���� �Է����ּ���. : ��) 15 15");
		
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
			System.out.println("�� ���� ����, ��� : 0");
		
		}
	}

}
