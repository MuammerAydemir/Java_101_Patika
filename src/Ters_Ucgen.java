import java.util.Scanner;

public class Ters_Ucgen {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Basamak giriniz:");
		number = input.nextInt();
		for (int i = number - 1; i > 0; i--) {
			for (int j = (number - i + 1); j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
