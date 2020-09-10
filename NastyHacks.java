import java.util.*;

public class NastyHacks
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i<n; i++)
        {
            int r = scan.nextInt();
            int e = scan.nextInt();
            int c = scan.nextInt();
            
            if(e-c > r)
            {
                System.out.println("advertise");
            }
            else if(e-c == r)
            {
                System.out.println("does not matter");
            }
            else if(e-c < r)
            {
                System.out.println("do not advertise");
            }
        }
    }
}