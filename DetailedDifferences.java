import java.util.Scanner;

public class DetailedDifferences 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
      scan.nextLine();
		String first, second, diff = "";
		String fArr[];
		String sArr[];
		for(int a = 0; a< cases; a++)
		{
			first = scan.nextLine();
			second = scan.nextLine();
			fArr = first.split("");
			sArr = second.split("");
			for(int b = 0; b< first.length(); b++)
			{
				if(fArr[b].equals(sArr[b]))
				{
					diff+=".";
				}
				else 
				{
					diff+="*";
				}
			}
			System.out.println(first);
			System.out.println(second);
			System.out.println(diff);
         diff = "";
			System.out.println();
		}
	}
}
