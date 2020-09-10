import java.util.*;

public class BrokenSwords {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int cases  = in.nextInt(), numTopAndBot = 0, numLeftAndRight = 0,stillMade = 0;
		String[] currentSword;
		for(int a = 0; a<cases; a++) {
			currentSword = in.next().split("");
			if(currentSword[0].equals("0"))
			{
				numTopAndBot++;
			}
			if(currentSword[1].equals("0"))
			{
				numTopAndBot++;
			}
			if(currentSword[2].equals("0"))
			{
				numLeftAndRight++;
			}
			if(currentSword[3].equals("0"))
			{
				numLeftAndRight++;
			}
		}
		while((numTopAndBot>0 && numLeftAndRight > 0)&&((numTopAndBot-2)>=0 && (numLeftAndRight-2)>=0) ) {
			numTopAndBot-=2;
			numLeftAndRight-=2;
			stillMade++;
		}
		System.out.println(stillMade+" "+ numTopAndBot+ " "+numLeftAndRight);
		//System.out.println(numTopAndBot);
		//System.out.println(numLeftAndRight);
	}
}
