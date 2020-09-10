import java.util.*;

public class SpeedLimit {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int input = in.nextInt(), hours = 0, prevhours = 0, miles = 0, totalDistance = 0;
		while (input != -1) {
			for (int x = 0; x < input; x++) {
				miles = in.nextInt();
				hours = in.nextInt();
				totalDistance += ((miles) * (hours - prevhours));
				prevhours = hours;
			}
			System.out.println(totalDistance + " miles");
			totalDistance = 0;
			prevhours = 0;
         input = in.nextInt();
		}
	}

}
