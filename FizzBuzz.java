import java.util.Scanner;

public class FizzBuzz 
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	int y = scan.nextInt();
	int num = scan.nextInt();
	for(int i  = 1; i <= num; i++)
	{
		if(i%x == 0 && i%y == 0)
		{
			System.out.println("FizzBuzz");
		}
		else if(i%x == 0)
		{
			System.out.println("Fizz");
		}
		else if(i%y == 0)
		{
			System.out.println("Buzz");
		}
		else
		{
		System.out.println(i);	
		}
	}
}
}
