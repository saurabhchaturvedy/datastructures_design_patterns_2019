package level01;

public class ArrayIntersectionPoint {

	int intersectionPoint(int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int intersectionPoint = 0;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				i++;
			} else if (left[i] > right[j]) {
				j++;
			} else {
				intersectionPoint = left[i];
				return intersectionPoint;
			}
		}

		return 0;

	}

	public static void main(String[] args) {

		int[] left = { 1, 2, 3, 6, 8, 10 };
		int[] right = { 4, 5, 6, 11, 15, 20 };
		ArrayIntersectionPoint arrayIntersectionPoint = new ArrayIntersectionPoint();
		int intersectionPoint = arrayIntersectionPoint.intersectionPoint(left, right);
		System.out.println("The intersection point is :" + intersectionPoint);

	}
}
