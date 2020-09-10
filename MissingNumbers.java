import java.util.*;

public class MissingNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int numbers = in.nextInt();
		ArrayList<Integer> nums = new ArrayList<Integer>(), numsMissed = new ArrayList<Integer>();
		for (int a = 0; a < numbers; a++) {
			nums.add(in.nextInt());
		}
		Collections.sort(nums);
		for (int b = 1; b <= nums.get((nums.size() - 1)); b++) {
			if (!nums.contains(b)) {
				numsMissed.add(b);
			}
		}
		if (numsMissed.size() == 0) {
			System.out.println("good job");
		} else {
			for (int c = 0; c < numsMissed.size(); c++) {
				System.out.println(numsMissed.get(c));
			}
		}
	}

}
