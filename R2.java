import java.util.*;
public class R2
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int R2;
      int R1 = scan.nextInt();
      int S = scan.nextInt();
      R2 = (S * 2) - R1;
      System.out.println("" + R2);
   }
}