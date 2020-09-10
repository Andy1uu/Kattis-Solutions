import java.util.*;

public class HelpAPHDStudentOut {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int cases = in.nextInt(), one , two;
		String[] problem;
		String prob;
		for(int a  = 0; a<cases; a++) {
			prob = in.next();
			problem  = prob.split("\\+");
			if(problem[0].equals("P=NP")) {
				System.out.println("skipped");
			}
			else {
				System.out.println(Integer.parseInt(problem[0])+Integer.parseInt(problem[1]));
			}
			
		}
	}

}
