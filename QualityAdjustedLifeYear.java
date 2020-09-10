import java.util.*;

public class QualityAdjustedLifeYear {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		double sum = 0;
		for(int a = 0; a<n;a++) {
			sum += in.nextDouble()*in.nextDouble();
		}
		System.out.printf("%.3f",sum);
	}

}
