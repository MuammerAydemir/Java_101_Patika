import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		int number, r, kombinas, total = 1, altTotal = 1, farkTotal = 1;

		Scanner input = new Scanner(System.in);
		System.out.print("Sayı giriniz(N): ");
		number = input.nextInt();
		System.out.print("Sayı giriniz(r): ");
		r = input.nextInt();
		for (int i = 1; i <= number; i++)
			total *= i;
		for (int j = 1; j <= r; j++)
			altTotal *= j;
		if(number>r) {
			for (int t = 1; t <= (number - r); t++)
				farkTotal *= t;			
			kombinas = total / (altTotal * farkTotal);
			System.out.println("Girilen Sayının Kombinasyonu " + "C(" + number + "," + r + "): " + kombinas);
			}else
				System.out.println("İkinci değer ilk değerden büyük olamaz!!!");
	}

}
