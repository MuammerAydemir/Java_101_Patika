import java.util.Scanner;

public class DesenMetot {

	static void Desen(int number, int temp, Boolean flag) {
		if (number > 0 && flag == false) {
			System.out.print(number + " ");
			number -= 5;
			Desen(number, temp, false);
		} else if (number <= 0) {
			System.out.print(number + " ");
			number += 5;
			Desen(number, temp, true);
		} else if (number > 0 && number <= temp && flag == true) {
			System.out.print(number + " ");
			number += 5;
			Desen(number, temp, true);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		System.out.print("N Sayısı : ");
		N = input.nextInt();
		int temp = N;
		boolean flag = false;
		Desen(N, temp, flag);

	}

}
