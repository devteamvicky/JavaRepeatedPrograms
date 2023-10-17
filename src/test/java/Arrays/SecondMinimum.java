package Arrays;

import java.util.Iterator;

public class SecondMinimum {
	public static void main(String[] args) {

		int[] number = { 9, 7, 9, 5, 99, 6, 8, 4, 5 ,0,2};
		int minimumNumber = number[0];
		int secondMinimuNumber = number[1];

		if (minimumNumber > secondMinimuNumber) {
			minimumNumber = number[1];
			secondMinimuNumber = number[0];
		}
		System.out.println("minimumNumber :" + minimumNumber);
		System.out.println("secondMinimuNumber :" + secondMinimuNumber);

		for (int i = 2; i < number.length; i++) {
			if (number[i] < minimumNumber) {
				secondMinimuNumber = minimumNumber;
				minimumNumber = number[i];
			}
		}
		for (int i = 2; i < number.length; i++) {
			if (number[i]<secondMinimuNumber) {
				 secondMinimuNumber= number[i];
			}
		}
		System.out.println("minimumNumber :" + minimumNumber);
		System.out.println("secondMinimuNumber :" + secondMinimuNumber);


	}
}
