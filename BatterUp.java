import java.util.*;

public class BatterUp {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int total = in.nextInt(), currentNum, numNegative = 0;
		double result = 0;
		for(int a = 0; a<total; a++) {
			currentNum = in.nextInt();
			if(currentNum>=0) {
				result+=currentNum;
			}
			else {
				numNegative++;
			}
		}
		result /= (total-numNegative);
		System.out.println(result);
	}
}
