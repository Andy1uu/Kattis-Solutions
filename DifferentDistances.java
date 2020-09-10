import java.util.*;
import java.text.DecimalFormat;
public class DifferentDistances {

	public static void main(String[] args) {
		double x1 =1,y1,x2,y2,p,d;
		DecimalFormat df = new DecimalFormat("#.0000000000");
		Scanner in = new Scanner(System.in);
		x1 = in.nextDouble();
		while(x1 != 0.0)
		{
			y1 = in.nextDouble();
			x2 = in.nextDouble();
			y2 = in.nextDouble();
			p = in.nextDouble();
			d = Math.pow((Math.pow(Math.abs((x1-x2)),p)+(Math.pow(Math.abs((y1-y2)),p))),(1/p));
			System.out.println(df.format(d));
			x1 = in.nextDouble();
		}
	}

}
