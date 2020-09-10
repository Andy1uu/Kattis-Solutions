import java.util.*;
public class Apaxiaaans 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String store = scan.next();
		String res = "";
		ArrayList<String> name = new ArrayList<String>();
		for(int a  = 0; a<store.length();a++)
		{
			name.add(store.substring(a,(a+1)));
		}
		for(int b = name.size()-1; b>0;b--)
		{
			if(name.get(b).equals(name.get(b-1)))
			{
				name.remove(b);
			}
		}
				for (String object: name) 
				{
				    res+=object;
				}
				System.out.println(res);
	}

}
