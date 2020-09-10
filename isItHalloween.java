import java.util.*;
public class isItHalloween 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        String month = scan.next();
        int day = scan.nextInt();
        if(month.equals("OCT") && day == 31)
        {
            System.out.println("yup");
        }
        else if(month.equals("DEC") && day == 25)
        {
            System.out.println("yup");
        }
        else
        {
            System.out.println("nope");
        }
    }
}