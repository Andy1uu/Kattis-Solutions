import java.util.*;

public class OneChickenPerPerson {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int people = in.nextInt(), numChicken = in.nextInt();
		if(numChicken-people == 1) {
			System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
		}
		else if(people-numChicken == 1) {
			System.out.println("Dr. Chaz needs 1 more piece of chicken!");
		}
		else if(people>numChicken) {
			System.out.println("Dr. Chaz needs "+(people-numChicken)+" more pieces of chicken!");
		}
		else {
			System.out.println("Dr. Chaz will have "+(numChicken-people)+" pieces of chicken left over!");
		}
	}

}
