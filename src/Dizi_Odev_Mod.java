import java.util.Arrays;

public class Dizi_Odev_Mod {

	static boolean isFound(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int[] liste = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int[] bosListe = new int[liste.length];
		System.out.println("Dizi: " + Arrays.toString(liste));
		System.out.println("Tekrar Sayıları");
		int indexx = 0;
		int count = 1;
		for (int i = 0; i < liste.length; i++) {
			if (isFound(bosListe, liste[i])) {
				for (int j = 0; j < liste.length; j++) {
					if ((i != j) && (liste[i] == liste[j])) {
						count++;
					}
				}
			}
			if (isFound(bosListe, liste[i])) {
				bosListe[indexx++] = liste[i];
				System.out.println(liste[i] + " sayısı " + count + " kere tekrar edildi.");
			}
			count = 1;
		}

	}
}
