import java.util.*;

public class RoamingRomans {

	public static void main(String[] args) {
		double res;
		double mile;
		Scanner in = new Scanner(System.in);
		mile = in.nextDouble();
		res = ((mile*1000)*(5280.0/4854.0));
		res = Math.round(res);
		System.out.println((int)res);
	}

}
