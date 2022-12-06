import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2, sayac = 1, ebob = 1, ekok = 1;
		System.out.print("1.ci Sayıyı Giriniz: ");
		number1 = input.nextInt();
		System.out.print("2.ci Sayıyı Giriniz: ");
		number2 = input.nextInt();
		sayac = number1;
		while (sayac <= number1) {
			if (number1 % sayac == 0 && number2 % sayac == 0) {
				ebob = sayac;
				break;
			}
			sayac--;
		}
		ekok = (number1 * number2) / ebob;
		System.out.println("Ebob'ları: " + ebob);
		System.out.println("Ekok'ları: " + ekok);
	}
}
