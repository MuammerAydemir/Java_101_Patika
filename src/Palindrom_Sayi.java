import java.util.Scanner;

public class Palindrom_Sayi {
	static void isPolindrom(int number) {
		int temp = number, reserveNumber = 0, lastNumber;
		while (temp != 0) {
			lastNumber = temp % 10;
			reserveNumber = (reserveNumber * 10) + lastNumber;
			temp /= 10;
		}
		if (number == reserveNumber) {
			System.out.println(number + " Palindrom Sayıdır!!");
		} else
			System.out.println(number + " Palindrom Sayı DEĞİLDİR!!");
	}

	public static void main(String[] args) {
		isPolindrom(101);
	}

}
