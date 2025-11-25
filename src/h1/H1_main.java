package h1;

public class H1_main {

	static int[] a = { 0, 1, 2, 3, 4 };
	static int[] b = { 4, 3, 2, 1, 0 };
	static int[] c = { 1, 2, 4 };
	static int[] d = { 1, 2, 2 };

	public static void main(String[] args) {
		System.out.println(isMirrorArray(d, c));
	}

	public static boolean isMirrorArray(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[b.length - i - 1]) {
				return false;
			}
		}

		return true;
	}
}
