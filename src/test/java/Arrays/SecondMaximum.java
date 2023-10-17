package Arrays;

public class SecondMaximum {

	public static void main(String[] args) {

		int[] number = { 45,7,8,9,18,17,18};
		int largestnumber = number[0];
		int secondLargestNumebr = number[1];
		if (largestnumber < secondLargestNumebr) {
			largestnumber = number[1];
			secondLargestNumebr = number[0];
		}
		for (int i = 2; i < number.length; i++) {
			if (largestnumber < number[i]) {
				secondLargestNumebr = largestnumber;
				largestnumber = number[i];
			}

		}
		for (int i = 2; i < number.length; i++) {
			if (secondLargestNumebr < number[i]) {
				secondLargestNumebr = number[i];
			}
		}
		System.out.println(largestnumber);
		System.out.println(secondLargestNumebr);
	}
}