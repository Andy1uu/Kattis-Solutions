import java.util.*;

public class TheAmazingHumanCannonball {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		double g = 9.81, vi, x1, h1, h2, height,t,theta;
		for(int a  = 0; a<cases; a++) {
			vi = in.nextDouble();
			theta = in.nextDouble();
			theta = Math.toRadians(theta);
			x1 = in.nextDouble();
			h1 = in.nextDouble()+1;
			h2 = in.nextDouble()-1;
			//System.out.println(" vi: "+vi+" theta: "+theta+" x1: "+x1+" h1: "+h1+" h2: "+h2);
			t = x1/(vi*Math.cos(theta));
			//System.out.println("cos(45)="+Math.cos(theta));
			height = vi*t*Math.sin(theta);
			height-= ((g*t*t)/2);
			//System.out.println(height);
			if(height>h1 && height<h2) {
				System.out.println("Safe");
			}
			else {
				System.out.println("Not Safe");
			}
		}

	}
}
