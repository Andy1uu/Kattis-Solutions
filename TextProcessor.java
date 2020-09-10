import java.util.*;

public class TextProcessor {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String test = in.nextLine();
		ArrayList<String> set = new ArrayList<String>();
		// HashSet<String> set = new HashSet<String>();
		int numQuestions = in.nextInt(), w = in.nextInt(), i;
		for (int a = 0; a < numQuestions; a++) {
			i = in.nextInt() - 1;
			set.add(test.substring(i, (i + w)));
			for (int c = w; c > 0; c--) {
				for (int b = 0; b < c; b++) {
					if (!set.contains(set.get(0).substring(b, c))) {
						set.add(set.get(0).substring(b, c));
					}
				}
			}
			System.out.println(set.size());
			set.clear();
		}

	}
}
