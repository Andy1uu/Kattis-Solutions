package Unsolved;

import java.util.*;

public class Aaah {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String first = in.next(), second = in.next();
		if(second.length() <= first.length()) {
			System.out.println("go");
		}
		else {
			System.out.println("no");
		}
	}

}
