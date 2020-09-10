import java.util.*;

public class SimonSays {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.nextLine();
		for (int a = 0; a < num; a++) {
			String sentence = in.nextLine();
			if (sentence.length() > 10 && sentence.substring(0, 10).equals("Simon says")) {
				System.out.println(sentence.substring(11));
			}
		}
	}
}
