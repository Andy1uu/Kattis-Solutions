import java.util.*;
public class Spavanac {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int hr = in.nextInt(), mn = in.nextInt();
		if(mn-45 < 0) {
			hr--;
			if(hr < 0) {
				hr = 23;
			}
			System.out.println(hr+" "+(mn-45+60));
		}
		else {
			System.out.println(hr+" "+(mn-45));
		}
	}

}
