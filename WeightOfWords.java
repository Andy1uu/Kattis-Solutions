import java.util.*;

public class WeightOfWords {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String alphabet[] = "abcdefghijklmnopqrstuvwxyz".split("");
		int length = in.nextInt(), weight = in.nextInt(), currentSum = 0, temp = 0;
		int word[] = new int[length];
		for (int a = 0; a < length; a++) {
			word[a] = 1;
		}
		if (26*length < weight || weight > 676) {
			System.out.println("impossible");
		} 
		else {
			while (temp < weight) {
				for (int c = 0; c < length; c++) {
					for (int b = 0; b < length; b++) {
						currentSum += word[b];
					}
					if (currentSum != weight) {
						word[c]++;
					}
					temp = currentSum;
					currentSum = 0;
				}
				//System.out.println(temp);
			}
			for(int d = 0; d<length;d++) {
					System.out.print(alphabet[word[d]-1]);
			}

		}
	}
}
