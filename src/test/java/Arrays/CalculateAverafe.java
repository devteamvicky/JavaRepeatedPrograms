package Arrays;

public class CalculateAverafe {
	public static void main(String[] args) {

		int[] number = { 10, 20, 40, 50, 70 };
		int sum = 0;
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
			count++;
		}
		System.out.println("Total sum of element in the arrays :" + sum);
		System.out.println("Total count of element in the arrays :" + count);
		float average = sum / count;
		System.out.println("Averge of element in the Array : " + average);
	}
}
