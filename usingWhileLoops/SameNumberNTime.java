package usingWhileLoops;

public class SameNumberNTime {
	public static void main(String [] args) {
		int num = 5;
		int count = 1;
		while(num>0) {
			System.out.print("  "+count); // printing the  count value for every iteration -
			count = count + 1; // - for this code
			num = num -1;
		}
	}

}
