import java.util.Scanner;

public class Harmonik {
	public static void main(String[] args) {
		int number; 
		double sum = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.print("Sayı giriniz: ");
		number = input.nextInt();
		for (double i = 1; i <= number; i++) {
			sum += (1 / i);
		}
		System.out.println("Harmonik Serisi sonucu: " + sum);
	}
}
