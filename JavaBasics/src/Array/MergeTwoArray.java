package Array;

public class MergeTwoArray {

	public static void main(String[] args) {

		int[] firstArray = { 23, 45, 12, 78, 4, 90, 1 }; // source array
		int[] secondArray = { 77, 11, 45, 88, 32, 56, 3 }; // destination array
		int fal = firstArray.length; // determines length of firstArray
		int sal = secondArray.length;
		int[] result = new int[fal + sal]; // resultant array of size first array and second array
		for (int i = 0; i < fal - 1; i++) {
			result[i] = firstArray[i];
		}
		int e = 0;
		for (int j = fal; j < result.length; j++) {
			result[j] = secondArray[e];
			e++;
		}
		for (int k = 0; k < result.length; k++) {
			System.out.print(result[k] + " ");
		}

	}

}
