import java.util.*;

public class DeathKnightHero {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt(), count = 0;
		for (int a = 0; a < cases; a++) {
			if (!in.next().contains("CD")) {
				count++;
			}
		}
		System.out.println(count);
	}
}