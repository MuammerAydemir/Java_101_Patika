import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int number, num2 = 0, num3 = 1, num4;
		Scanner input = new Scanner(System.in);
		System.out.print("Eleman sayısı: ");
		number = input.nextInt();
		System.out.print(number + " Elemanlı Fibonacci Serisi : " + num2 + " " + num3);
		for (int i = 2; i <= number; i++) {
			num4 = num2 + num3;
			System.out.print(" " + num4);
			num2 = num3;
			num3 = num4;

		}

	}

}
