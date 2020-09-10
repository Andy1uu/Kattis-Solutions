import java.util.*;

public class DiceCup {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m = in.nextInt();
		if(n==m) {
			System.out.print(n+1);
		}
		else if(n<m) {
			for(int a = n+1; a<m+2;a++) {
				System.out.println(a);
			}
		}
		else {
			for(int a = m+1; a<n+2;a++) {
				System.out.println(a);
			}
		}
	}

}
