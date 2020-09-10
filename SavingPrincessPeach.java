import java.util.*;


public class SavingPrincessPeach 
{
	public static void main(String[] args)
	{
		Scanner scan =  new Scanner(System.in);
		int totalO = scan.nextInt();
		int mO = scan.nextInt();
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0; i<mO; i++)
		{
			hs.add(scan.nextInt());
		}
		for(int g = 0; g<totalO; g++)
		{
			if(!hs.contains(g))
			{
				System.out.println(g);
			}
		}
		System.out.println("Mario got "+hs.size()+" of the dangerous obstacles.");
	}

}
