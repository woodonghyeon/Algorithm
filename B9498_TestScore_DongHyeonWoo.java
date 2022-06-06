import java.util.Scanner;

public class B9498_TestScore_DongHyeonWoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("성적 입력 : ");
		int n = sc.nextInt();
		
		if(n >= 0) {
			if(n >= 90) {
				System.out.println("A");
			} else if(n >= 80 && n <= 89) {
				System.out.println("B");
			} else if(n >= 70 && n <= 79) {
				System.out.println("C");
			} else if(n >= 60 && n <= 69) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		} else if(n < 0) {
			 System.out.println("0보다 작은 성적은 없습니다.");
		}
		
		
	}

}
