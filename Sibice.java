import java.util.*;
public class Sibice 
{
	public static void main(String[] args)
	{
		int num, wid, hei, size;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		wid = scan.nextInt();
		hei = scan.nextInt();
		for(int a = 0; a<num;a++)
		{	
			size = scan.nextInt();
			if(size < hei || size < wid || size <= Math.hypot(wid, hei))
			{
				System.out.println("DA");
			}
			else
			{
				System.out.println("NE");
			}
		}
	}
}
