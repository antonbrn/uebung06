package h2;

public class H2_main {

	static int[] a = { 0, 1, 2, 3, 4 };
	static int[] b = { 4, 3, 2, 1, 0 };
	static int[] c = { 1, 3, 4, 0};
	static int[] d = { 1, 3, 4, 0};

	public static void main(String[] args) {
		System.out.println(compareArrays(c, d));
	}

	public static boolean compareArrays(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}

		return true;
	}
}
