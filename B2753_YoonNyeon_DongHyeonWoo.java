import java.util.Scanner;

public class B2753_YoonNyeon_DongHyeonWoo {
	static int year;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("확인할 연도를 입력하시오. : ");
		year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
