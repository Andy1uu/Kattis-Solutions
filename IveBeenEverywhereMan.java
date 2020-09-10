import java.util.HashSet;
import java.util.Scanner;

public class IveBeenEverywhereMan 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt(), numTowns;
		scan.nextLine();
		HashSet<String> hs = new HashSet<String>();
		for(int a = 0;a<cases;a++)
		{
			numTowns = scan.nextInt();
			for(int b = 0;b<numTowns;b++)
			{
			hs.add(scan.next());
			}
			System.out.println(hs.size());
			hs = new HashSet<String>();
		}
	}

}
