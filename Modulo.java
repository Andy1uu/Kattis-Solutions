import java.util.*;
public class Modulo 
{
    public static void main(String args[]) 
    {
        int int1;
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0;i<10;i++)
        {
            int1 = scan.nextInt()%42;
            hs.add(int1);
            }
        System.out.println(hs.size());
        
    }
}