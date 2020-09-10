import java.util.*;
public class LastFactorialDigit {
	public static int factorial(int n) {
	if (n == 1)
		return 1;
	else
		return n*factorial(n-1);
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int i = 0; i<cases;i++) {
			int num = scan.nextInt();
			System.out.println((factorial(num)%10));
		}
	}
	
}
