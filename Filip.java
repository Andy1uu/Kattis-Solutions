import java.util.Scanner;

public class Filip 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String first[] = scan.next().split("");
		String second[] = scan.next().split("");
		String firstR[] = new String[3];
		String secondR[] = new String[3];
		int count = 0;
		for(int i = first.length-1; i>=0;i--)
		{
			firstR[count] = first[i];
			secondR[count] = second[i];
			count++;
		}
		String rF = "";
		String rS = "";
		for(int a = 0; a<3;a++)
		{
			rF+= firstR[a];
			rS+= secondR[a];
		}
		int f = Integer.parseInt(rF);
		int s = Integer.parseInt(rS);
		if(f>s)
		{
			System.out.println(f);
		}
		else
		{
			System.out.println(s);
		}
	}
}
