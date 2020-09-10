import java.util.*;
public class ColdputerScience
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int num = scan.nextInt();
      int numPos = 0;
      for(int i = 0; i < num; i++)
      {
         int temperature = scan.nextInt();
         if(temperature < 0)
         {
            numPos++;
         }
      }
      System.out.println(""+numPos);
   }
}