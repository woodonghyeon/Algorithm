import java.util.*;	
import java.io.*;


public class B4158_CD_DongHyeonWoo {
	static int n, m;  // n ���, m ���� ���������� ����
	static int cnt;
	static HashSet<Integer> set;
	
	public static void main(String[] args) throws Exception {
/* ���� : ����̿� �����̴� ���ÿ� ������ �ִ� CD�� �ȷ��� �Ѵ�. CD�� �� ���� �� �� ������?
 *
 * �Է� : �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� ù° �ٿ��� 
 * ����̰� ������ �ִ� CD�� �� N, �����̰� ������ �ִ� CD�� �� M�� �־�����. N�� M�� �ִ� �鸸�̴�. 
 * ���� �ٺ��� N�� �ٿ��� ����̰� ������ �ִ� CD�� ��ȣ�� ������������ �־�����. 
 * ���� M�� �ٿ��� �����̰� ������ �ִ� CD�� ��ȣ�� ������������ �־�����. 
 * CD�� ��ȣ�� �ʾ��� ���� �ʴ� ���� �����̴�. �Է��� ������ �ٿ��� 0 0�� �־�����.
 * ����̿� �����̰� ���� CD�� ������ ������ �ִ� ���� ����.
 * 
 * ��� : �� ����� ���ÿ� ������ �ִ� CD�� ������ ����Ѵ�.
 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("����̰� ������ �ִ� CD�� ��, �����̰� ������ �ִ� CD�� �� �Է� : ex) 10 5  // 0 0 �Է½� ����");
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			// 0, 0 �Ͻ� ����
			if(n == 0 && m == 0) {
				break;
			}
			// �ʱ�ȭ
			set = new HashSet<>();
			cnt = 0;
			
			// n�� set�� ���, ����� ���� cd�� set�� ��� 
			for (int i = 0; i < n; i++) {
				set.add(Integer.parseInt(br.readLine()));
			}
			// �����̰� ���� cd�� �¿� �ִ��� Ȯ��
			for (int i = 0; i < n; i++) {
				int cd = Integer.parseInt(br.readLine());
				
				// �ִٸ� count ����
				if (set.contains(cd))
					cnt++;
			}
			System.out.println(cnt);
		}
	}
}
