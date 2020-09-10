import java.util.Scanner;

public class ProvincesandGold 
{
	public static void main(String[] args) 
	{
Scanner scan = new Scanner(System.in);
int g = scan.nextInt();
int s = scan.nextInt();
int c = scan.nextInt();
int total = 3*g+2*s+c;
if(total >= 8)
{
	System.out.print("Province or ");
}
else if(total>=5)
{
	System.out.print("Duchy or ");
}
else if(total >=2)
{
	System.out.print("Estate or ");
}
if(total >= 6)
{
	System.out.print("Gold");
}
else if(total >= 3)
{
	System.out.print("Silver");
}
else
{
	System.out.print("Copper");
}
}
}
