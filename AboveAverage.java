import java.util.*;

public class AboveAverage {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int cases  = in.nextInt(), size;
		double total = 0, average,counter = 0;
		int arr[];
		for(int a  = 0; a <cases; a++) {
			size = in.nextInt();
			arr = new int[size];
			for(int b = 0; b<size;b++) {
				arr[b] = in.nextInt();
				total+=arr[b];
			}
			average = total/size;
			for(int c = 0; c<size;c++) {
				if(arr[c]>average) {
					counter ++;
				}
			}
			System.out.printf("%.3f", (counter/size)*100);
			System.out.println("%");
			total = 0;
			counter = 0;
		}
	}

}
