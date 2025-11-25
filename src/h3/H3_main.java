package h3;

public class H3_main {

	static int[] a = { 0, 2, 1, 3, 4 };
	static int[] b = { 4, 3, 2, 1, 0 };
	static int[] c = { 1, 1, 3, 0 };
	static int[] d = { 1, 3, 4, 0 };

	public static void main(String[] args) {
		System.out.println(compareArraysVal(a, b));
	}

	public static boolean compareArraysVal(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {

			int akt = a[i];
			int a_anzahl = 0;
			int b_anzahl = 0;

			for (int j = 0; j < a.length; j++) {
				if (a[j] == akt) {
					a_anzahl += 1;
				}
			}
			for (int j = 0; j < b.length; j++) {
				if (b[j] == akt) {
					b_anzahl += 1;
				}
			}
			if (a_anzahl != b_anzahl) {
				return false;
			}
		}

		return true;
	}
}
