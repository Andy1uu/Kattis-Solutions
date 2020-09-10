import java.util.*;

public class HonourThyApaxianParent {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String[] words = in.nextLine().split(" ");
		if(words[0].charAt((words[0].length()-1)) == 'e') {
			System.out.println(words[0]+"x"+words[1]);
		}
		else if((words[0].charAt((words[0].length()-1)) == 'a')||(words[0].charAt((words[0].length()-1)) == 'o')||(words[0].charAt((words[0].length()-1)) == 'i')||(words[0].charAt((words[0].length()-1)) == 'u')) {
			System.out.println(words[0].substring(0,(words[0].length()-1))+"ex"+words[1]);
		}
		else if(words[0].substring((words[0].length()-2)).equals("ex")) {
			System.out.println(words[0]+words[1]);
		}
		else {
			System.out.println(words[0]+"ex"+words[1]);
		}
	}

}
