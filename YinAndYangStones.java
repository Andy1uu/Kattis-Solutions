import java.util.*;

public class YinAndYangStones {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numBlack = 0, numWhite = 0;
		String[] stones = in.next().split("");
		//probably wrong
		for (int a = 0; a < stones.length; a++) {
			if (stones[a].equals("W")) {
				numWhite++;
			} else if (stones[a].equals("B")) {
				numBlack++;
			}
		}
		if ((numBlack == numWhite) || ((numBlack - numWhite) == 1) || ((numWhite - numBlack) == 1)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}