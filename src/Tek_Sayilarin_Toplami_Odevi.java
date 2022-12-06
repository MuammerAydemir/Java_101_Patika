import java.util.Scanner;

public class Tek_Sayilarin_Toplami_Odevi {

	public static void main(String[] args) {
		int number, sum = 0;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Sayı Giriniz: ");
			number = input.nextInt();
			if ((number % 2 == 0) && (number % 4 == 0)) {
				sum += number;
			} else if (number % 2 == 1) {
				System.out.println("Sum: " + sum);
				break;
			}

		}

	}

}
