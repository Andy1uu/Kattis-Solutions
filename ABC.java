import java.util.*;

public class ABC {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String res = "";
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(in.nextInt());
		nums.add(in.nextInt());
		nums.add(in.nextInt());
		in.nextLine();
		Collections.sort(nums);
		//System.out.println(nums);
		String[] abc = in.nextLine().split("");
		for(int a = 0; a<3;a++) {
			if(abc[a].equals("A")) {
				res+= nums.get(0)+ " ";
			}
			else if(abc[a].equals("B")) {
				res+= nums.get(1)+ " ";
			}
			else {
				res+= nums.get(2)+ " ";
			}
		}
		System.out.println(res);
	}

}
