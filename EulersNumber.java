import java.text.DecimalFormat;
import java.util.*;

public class EulersNumber {
	public static  double factorial(double n) {
		  if(n == 1 || n == 0)
		    return 1;
		  else
		  return n * factorial(n-1);
		}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();
		DecimalFormat df = new DecimalFormat("#.###############");
		double total = 0;
		for(double a = 0; a<=n;a++) {
			total+=(1.0/factorial(a));
	}
		System.out.println(df.format(total));
		}
}
