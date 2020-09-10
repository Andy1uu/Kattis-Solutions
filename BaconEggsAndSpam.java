import java.util.*;

public class BaconEggsAndSpam {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		HashMap<String, String> menu = new HashMap<String, String>();
		ArrayList<String> menuItems, listOfNames;
		int numPeople = in.nextInt();
		in.nextLine();
		String[] nameAndOrder, names;
		String allNames = "";
		while (numPeople != 0) {
			for (int a = 0; a < numPeople; a++) {
				nameAndOrder = in.nextLine().split(" ");
				for (int b = 1; b < nameAndOrder.length; b++) {
					menu.put(nameAndOrder[b], menu.getOrDefault(nameAndOrder[b], "") + " " + nameAndOrder[0]);
				}
			}
			menuItems = new ArrayList<String>(menu.keySet());
			Collections.sort(menuItems);
			for (int d = 0; d < menu.size(); d++) {
				names = menu.get(menuItems.get(d)).split(" ");
				listOfNames = new ArrayList<String>();
				for (int e = 0; e < names.length; e++) {
					listOfNames.add(names[e]);
				}
				Collections.sort(listOfNames);
				for (int e = 0; e < listOfNames.size(); e++) {
				allNames+=listOfNames.get(e) + " ";
				}
				System.out.println(menuItems.get(d)+allNames);
				allNames = "";
			}
			menu = new HashMap<String, String>();
			numPeople = in.nextInt();
			in.nextLine();
		}
	}
}
