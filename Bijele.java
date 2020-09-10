import java.util.*;
public class Bijele
{
   public static void main(String[] args)
   {
      final int KING = 1;
      final int QUEEN = 1;
      final int ROOKS = 2;
      final int BISHOPS = 2;
      final int KNIGHTS = 2;
      final int PAWNS = 8;
      
      int countk = 0;
      int countq = 0;
      int countr = 0;
      int countb = 0;
      int countkn = 0;
      int countp = 0;
   
      Scanner scan = new Scanner(System.in);
      int king = scan.nextInt();
      int queen = scan.nextInt();
      int rooks = scan.nextInt();
      int bishops = scan.nextInt();
      int knights = scan.nextInt();
      int pawns = scan.nextInt();
   
      if(king < KING)
      {
         king++;
         countk++;
      }
      else
      {
         while(king != KING)
         {
            king--;
            countk--;
         }
      }
         
      if(queen < QUEEN)
      {
         queen++;
         countq++;
      }
      else
      {
         while(queen != QUEEN)
         {
            queen--;
            countq--;
         }
      }
         
      if(rooks < ROOKS)
      {
 while(rooks != ROOKS)
         {
            rooks++;
            countr++;
         }
      }
      else
      {
         while(rooks != ROOKS)
         {
            rooks--;
            countr--;
         }
      }  
      
      if(bishops < BISHOPS)
      {
         while(bishops != BISHOPS)
         {
            bishops++;
            countb++;
         }
      }
      else
      {
         while(bishops != BISHOPS)
         {
            bishops--;
            countb--;
         }
      }  
      
      if(knights < KNIGHTS)
      {
         while(knights != KNIGHTS)
         {
            knights++;
            countkn++;
         }
      }
      else
      {
         while(knights != KNIGHTS)
         {
            knights--;
            countkn--;
         }
      } 
      
      if(pawns < PAWNS)
      {
         while(pawns != PAWNS)
         {
            pawns++;
            countp++;
         }
      }
      else
      {
         while(pawns != PAWNS)
         {
            pawns--;
            countp--;
         }
      }  
      
      System.out.println(""+countk+" "+countq+" "+countr+" "+countb+" "+countkn+" "+countp);
   }
}