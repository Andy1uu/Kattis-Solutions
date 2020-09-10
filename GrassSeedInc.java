import java.util.*;

public class GrassSeedInc {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double c, w, l, totalCost = 0;
		int numLawns;
		c= in.nextDouble();
		numLawns = in.nextInt();
		for(int a = 0; a< numLawns; a++) {
			l = in.nextDouble();
			w = in.nextDouble();
			totalCost += l*w*c;
		}
		System.out.printf("%.6f",totalCost);
	}

}
