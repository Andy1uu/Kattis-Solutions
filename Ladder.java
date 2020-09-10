import java.util.Scanner;

public class Ladder 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int v = scan.nextInt();
		double angle = v *(Math.PI/180);
		int ladder = (int)Math.ceil(h/Math.sin(angle));
		System.out.println(ladder);
	}

}
