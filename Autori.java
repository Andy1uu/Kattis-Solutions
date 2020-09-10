import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Autori
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str = br.readLine().split("-");
        String result = "";
        for(int a = 0;a<str.length;a++)
        {
            result += str[a].charAt(0)+"";
        }
        System.out.println(result);
        
    }
}