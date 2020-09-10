import java.util.*;

public class SumKindofProblem {
public static long sum(long n) {
	if(n>0) {
		return n+sum(n-1);
	}
	return n;
}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long cases = in.nextInt(),k, n, sPos = 0,sOdd =0 ,sEven = 0;
	for(int a  = 0; a<cases;a++) {
		k = in.nextInt();
		n = in.nextInt();
		sPos = sum(n);

			System.out.println(k + " " + sPos + " " + sOdd + " " + sEven);
			sPos = 0;
			sOdd = 0;
			sEven = 0;
		}
	}
}

