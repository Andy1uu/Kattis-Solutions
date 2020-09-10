import java.util.*;
public class HissingMicrophone
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(str.contains("ss"))
        {
            System.out.println("hiss");
        }
        else
        {
            System.out.println("no hiss");
        }
    }
}