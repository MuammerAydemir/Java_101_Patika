import java.util.Scanner;

public class AsalRecursive {

	static boolean Asal(int n, int i) {
		if (n <= 2)
			return (n == 2) ? true : false;
		if (n % i == 0)
			return false;
		if (i * i > n)
			return true;

		return Asal(n, i + 1);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		while (true) {
			System.out.print("Sayı Giriniz : ");
			number = input.nextInt();
			if (number < 0)
				System.out.println("Girilen sayı sıfırdan küçük olamaz!!!");
			else if (Asal(number, 2))
				System.out.println(number + " sayısı ASALDIR !");
			else
				System.out.println(number + " sayısı ASAL değildir !");
		}
	}

}
