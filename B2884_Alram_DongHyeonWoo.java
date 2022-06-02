import java.util.Scanner;

public class B2884_Alram_DongHyeonWoo {

	public static void main(String[] args) {
		int h, m;
		Scanner sc = new Scanner(System.in);
		System.out.printf("시간 입력 : ");
		
		h = sc.nextInt();
		m = sc.nextInt();
		
		if(m < 45) {
			h--;
			m = 60 - (45 - m);
			if(h < 0) {
				h = 23;
			}
			System.out.println(h + " " + m);
		} else {
			System.out.println(h + " " + (m - 45));
		}
		
	}

}
