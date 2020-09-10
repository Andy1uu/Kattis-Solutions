import java.util.*;

public class Mjehuric {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int temp;
		int[] inital = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()},finalArr = {1,2,3,4,5};
		String init = inital[0]+" "+inital[1]+" "+inital[2]+" "+inital[3]+" "+inital[4], fin = "1 2 3 4 5";
		while(!init.equals(fin)) {
			if(inital[0]>inital[1]) {
				temp = inital[1];
				inital[1] = inital[0];
				inital[0] = temp;
				init = inital[0]+" "+inital[1]+" "+inital[2]+" "+inital[3]+" "+inital[4];
			    System.out.println(init);

			}
			if(inital[1]>inital[2]) {
				temp = inital[2];
				inital[2] = inital[1];
				inital[1] = temp;
				init = inital[0]+" "+inital[1]+" "+inital[2]+" "+inital[3]+" "+inital[4];
				System.out.println(init);
			}
			if(inital[2]>inital[3]) {
				temp = inital[3];
				inital[3] = inital[2];
				inital[2] = temp;
				init = inital[0]+" "+inital[1]+" "+inital[2]+" "+inital[3]+" "+inital[4];
				System.out.println(init);
			}
			if(inital[3]>inital[4]) {
				temp = inital[4];
				inital[4] = inital[3];
				inital[3] = temp;
				init = inital[0]+" "+inital[1]+" "+inital[2]+" "+inital[3]+" "+inital[4];
				System.out.println(init);
			}
		}
	}

}
