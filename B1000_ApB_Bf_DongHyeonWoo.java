import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1000_ApB_Bf_DongHyeonWoo {

	public static void main(String[] args) throws IOException{
		// ���� 15552, A+B
		/*���� : ���������� for�� ������ Ǯ�� ���� �����ؾ� �� ���� �ִ�. ����� ����� ������ ���� ���� �Է¹ްų� ����� �� �ð��ʰ��� �� �� �ִٴ� ���̴�.
		 * C++�� ����ϰ� �ְ� cin/cout�� ����ϰ��� �Ѵٸ�, cin.tie(NULL)�� sync_with_stdio(false)�� �� �� ������ �ְ�, endl ��� ���๮��(\n)�� ����.
		 * ��, �̷��� �ϸ� �� �̻� scanf/printf/puts/getchar/putchar �� C�� ����� ����� ����ϸ� �� �ȴ�. 
		 * Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�. 
		 * BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.
		 * Python�� ����ϰ� �ִٸ�, input ��� sys.stdin.readline�� ����� �� �ִ�. ��, �̶��� �� ���� ���๮�ڱ��� ���� �Է¹ޱ� ������ ���ڿ��� �����ϰ� ���� ���
		 * .rstrip()�� �߰��� �� �ִ� ���� ����. ���� �Է°� ��� ��Ʈ���� �����̹Ƿ�, �׽�Ʈ���̽��� ���� �Է¹޾Ƽ� ������ �� ���� ����� �ʿ�� ����. 
		 * �׽�Ʈ���̽��� �ϳ� ���� �� �ϳ� ����ص� �ȴ�.*/
		
		System.out.printf("�Է��� Ƚ���� �Է��Ͻÿ�. : ");
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  // �� �з¹ޱ�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // �� ����ϱ�
		
		StringTokenizer st;  // ���� ������ ����
		int t = Integer.parseInt(bf.readLine()); // ������ �� ��ȯ, �Է� ���� Ƚ��
		
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(bf.readLine());
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n"); // �� ��ȯ�Ͽ� �ջ���
		}
		
		bw.close(); // ��� �ݱ�, Scanner�� �޸� �� ���� �������־����
	}

}
