package Arrays;

public class LargestandSmallest {
	public static void main(String[] args) {

		int[] number = { 78,90,68,82,10,6 };

		int largestNum = number[0];
		int smallestNum = number[0];

		for (int i = 0; i < number.length; i++) {

			if (largestNum < number[i]) {
				largestNum = number[i];
			}
			if (smallestNum > number[i]) {
				smallestNum = number[i];
			}
		}
		System.out.println("largestNum in the array : "+largestNum);
		System.out.println("smallestNum in the array :"+smallestNum);

	}

}
