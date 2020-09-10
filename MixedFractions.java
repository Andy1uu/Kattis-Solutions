import java.util.*;

public class MixedFractions {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt(), num2 = in.nextInt(), whole, remainder;
		while (num1 != 0 && num2 != 0) {
			whole = num1 / num2;
			remainder = num1 % num2;
			System.out.println(whole + " " + remainder + " / " + num2);
			num1 = in.nextInt();
			num2 = in.nextInt();
		}

	}
}
