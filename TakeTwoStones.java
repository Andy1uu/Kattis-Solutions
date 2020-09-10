import java.util.*;

public class TakeTwoStones {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n % 2 == 1) {
			System.out.println("Alice");
		}
		if (n % 2 == 0) {
			System.out.println("Bob");
		}
	}
}