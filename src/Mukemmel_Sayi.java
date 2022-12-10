import java.util.Scanner;

public class Mukemmel_Sayi {

	public static void main(String[] args) {
		int number, compare = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		number = input.nextInt();
		if (number > 0) {
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					compare += i;
				}
			}
			if (compare == number) {
				System.out.println(number + " Mükemmel sayıdır.");
			} else if (compare != number)
				System.out.println(number + " Mükemmel sayı değildir.");
		} else {
			System.out.println("Girilen sayı sıfırdan büyük olmalıdır!!!");
		}
	}

}
