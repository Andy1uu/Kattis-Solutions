import java.util.*;

public class JobExpenses {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int expenses = 0, num = scan.nextInt(), currentExpense;
		for (int a = 0; a < num; a++) {
			currentExpense = scan.nextInt();
			if (currentExpense < 0)
				expenses += Math.abs(currentExpense);
		}
		System.out.println(expenses);
	}
}
