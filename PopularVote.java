import java.util.*;

public class PopularVote {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int cases = in.nextInt(),numCand,totalVotes=0;
		ArrayList<Integer> votes1, votes2;
		for(int a  = 0; a<cases;a++) {
			numCand = in.nextInt();
			votes1 = new ArrayList<Integer>();
			votes2 = new ArrayList<Integer>();
			for(int b = 0; b<numCand;b++) {
				votes1.add(in.nextInt());
				votes2.add(votes1.get(b));
				totalVotes += votes1.get(b);
			}
			Collections.sort(votes2);
			if(votes2.get(votes2.size()-1) > votes2.get(votes2.size()-2) && ((double)(votes2.get(votes2.size()-1)) > (0.5*totalVotes))) {
				System.out.println("majority winner "+(votes1.indexOf(votes2.get(votes2.size()-1))+1));
			}
			else if(votes2.get(votes2.size()-1) > votes2.get(votes2.size()-2) && ((double)(votes2.get(votes2.size()-1)) <= (0.5*totalVotes))) {
				System.out.println("minority winner "+(votes1.indexOf(votes2.get(votes2.size()-1))+1));
			}
			else {
				System.out.println("no winner");
			}
			totalVotes = 0;
		}
	}
}
