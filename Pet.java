import java.util.*;

public class Pet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dFF[][] = new int[5][4];
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 4; b++) {
				dFF[a][b] = in.nextInt();
			}
		}
		ArrayList<Integer> points = new ArrayList<Integer>();
		int totalPoints = 0;
		for (int a = 0; a < 5; a++) {
			for (int b = 0; b < 4; b++) {
				totalPoints+=dFF[a][b];
			}
			points.add(totalPoints);
			totalPoints = 0;
		}
		System.out.println((points.indexOf(Collections.max(points))+1) + " " + Collections.max(points));
	}

}
