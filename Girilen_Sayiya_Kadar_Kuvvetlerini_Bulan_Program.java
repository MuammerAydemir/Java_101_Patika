import java.util.Scanner;

public class Girilen_Sayiya_Kadar_Kuvvetlerini_Bulan_Program {

	public static void main(String[] args) {
		int number, temp = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı Giriniz: ");
		number = input.nextInt();
		for (int i = 1, j = 1; i < number && j < number; i *= 4, j *= 5) {
			System.out.print(i + " ,");
			System.out.print(j + " ,");
		}
	}
}
