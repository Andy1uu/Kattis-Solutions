import java.util.*;

public class ClimbingWorm {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int climbHeight  = in.nextInt(), fallHeight = in.nextInt(), totalHeight = in.nextInt(), currentHeight = 0, count = 0;
		while(currentHeight<totalHeight) {
			currentHeight+=climbHeight;
			count++;
			if(currentHeight<totalHeight) {
				currentHeight-=fallHeight;
			}
		}
		System.out.println(count);
	}
}
