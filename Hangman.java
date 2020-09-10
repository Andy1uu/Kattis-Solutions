import java.util.*;

public class Hangman {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String word = in.nextLine(), order = in.nextLine();
		String[] wordArr = word.split("");
		String[] orderArr = order.split("");
		int numWrong = 0, iter = 0;
		ArrayList<String> wordList = new ArrayList<String>();
		for (int a = 0; a < wordArr.length; a++) {
			wordList.add(wordArr[a]);
		}
		while (wordList.size() != 0 && numWrong < 10) {
			if (wordList.contains(orderArr[iter])) {
				while (wordList.contains(orderArr[iter])) {
					wordList.remove(orderArr[iter]);
				}
			} 
			else if (!wordList.contains(orderArr[iter])) {
				numWrong++;
			}
			iter++;
		}
		if(wordList.size() == 0) {
			System.out.println("WIN");
		}
		else {
			System.out.println("LOSE");
		}
	}
}
