
public class Asal_Bul {

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			int j;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (j == i)
				System.out.print(i + " ");
		}

	}

}
