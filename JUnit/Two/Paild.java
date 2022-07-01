package Two;

public class Paild {
	public static boolean checkP(String s1, String s2) {
		String rev = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}

		if (rev.equals(s1) && rev.equals(s2)) {

			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		System.out.println(Paild.checkP("ili", "ili"));

	}

}
