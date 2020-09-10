import java.util.*;

public class NoDup
{
    public static void main(String args[])
    {
       Scanner scan = new Scanner(System.in);
       String str[] = scan.nextLine().split(" ");
       HashSet<String> hs = new HashSet<String>();
       for(int i = 0;i<str.length;i++)
       {
        hs.add(str[i]);
       }
       if(str.length == hs.size())
       {
        System.out.println("yes");   
       }
       else
       {
       System.out.println("no");
       }
    }
}