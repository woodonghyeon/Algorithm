import java.util.Scanner;

public class B14681_Quadrant_DongHyeonWoo {
	static int x, y;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println("Quadrant 1");
		} else if(x < 0 && y > 0) {
			System.out.println("Quadrant 2");
		} else if(x < 0 && y < 0) {
			System.out.println("Quadrant 3");
		} else if(x > 0 && y < 0) {
			System.out.println("Quadrant 4");
		} else {
			System.out.println("0, 0");
		}

	}

}
