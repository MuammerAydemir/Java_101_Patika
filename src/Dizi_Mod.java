public class Dizi_Mod {
	static boolean isFound(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		int[] liste = { 12, 35, 26, 12, 1, 62, 789, 12, 51, 51, 26 };
		int[] bosListe = new int[liste.length];
		int indexx = 0;
		for (int i = 0; i < liste.length; i++) {
			for (int j = 0; j < liste.length; j++) {
				if ((i != j) && (liste[i] == liste[j])) {
					if (!isFound(bosListe, liste[i])) {
						bosListe[indexx++] = liste[i];

					}
				}
			}
		}
		for (int deger : bosListe) {
			if (deger != 0 && deger % 2 == 0) {
				System.out.println(deger);
			}
		}
	}

}
