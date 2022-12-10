import java.util.Scanner;

public class UsRecursive {

	public static void main(String[] args) {
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.print("Taban değeri giriniz : ");
			int number = input.nextInt();
			System.out.print("Us değeri giriniz : ");
			int number2 = input.nextInt();

			if (number2 >= 0)
				System.out.println("Sonuç : " + usAlma(number, number2));
			else {
				int temp = 1;
				for (int i = 0; i > number2; i--) {
					temp *= number;
				}
				System.out.println("Sonuç: 1/" + temp);
			}
		}
	}

	static int usAlma(int num, int pow) {
		if (pow < 1)
			return 1;
		else
			return num * usAlma(num, pow - 1);

	}

}
