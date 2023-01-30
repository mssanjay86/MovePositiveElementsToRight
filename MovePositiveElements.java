public class MovePositiveElements {
	public static void main(String[] args) {
		int arr[] = { 1, 3, -1, -5, 2, -6, 8 };

		for (int i : arr) {
			if (i < 0) {
				System.out.print(i + " ");
			}
		}
		for (int j : arr) {
			if (j >= 0) {
				System.out.print(j + " ");
			}
		}
	}
}
