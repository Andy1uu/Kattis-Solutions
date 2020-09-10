import java.util.*;

public class Tarifa {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int dataAmount = in.nextInt(), numMonths = in.nextInt(), currentDataAmount = dataAmount, dataUsed;
		for(int a = 0; a<numMonths; a++) {
			dataUsed = in.nextInt();
			currentDataAmount-= dataUsed;
			currentDataAmount+=dataAmount;
		}
		System.out.println(currentDataAmount);
	}
}
