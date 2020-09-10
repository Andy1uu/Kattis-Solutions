import java.util.*;

public class LeftBeehind
{
   public static void main(String[] args)
   {
      int sweet, sour;
      Scanner scan = new Scanner(System.in);
      sweet = scan.nextInt();
      sour = scan.nextInt();
      while(!(sour == 0 && sweet == 0)) 
      {
         if( sour+sweet == 13)
         {
            System.out.println("Never speak again.");
         }
         else if(sour>sweet)
         {
            System.out.println("Left beehind.");
         }
         else if(sour<sweet)
         {
            System.out.println("To the convention.");
         }
         else if(sour == sweet)
         {
            System.out.println("Undecided.");
         }
         
         sweet = scan.nextInt();
         sour = scan.nextInt();
      }
      
      
   }
}