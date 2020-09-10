import java.util.*;

public class SymmetricOrder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numPeople = in.nextInt(), setNum = 1;
		ArrayList<String> people = new ArrayList<String>(), people2 = new ArrayList<String>();
		while (numPeople != 0) {
			System.out.println("SET "+setNum);
			for (int a = 0; a < numPeople; a++) {
				if (a % 2 == 0) {
					people.add(in.next());
				} else {
					people2.add(in.next());
				}
			}
			for(int b = 0;b<people.size();b++) {
				System.out.println(people.get(b));
			}
			for(int c = people2.size()-1;c>=0;c--) {
				System.out.println(people2.get(c));
			}
			setNum++;
			people = new ArrayList<String>();
			people2 = new ArrayList<String>();
			numPeople = in.nextInt();
		}
	}

}
