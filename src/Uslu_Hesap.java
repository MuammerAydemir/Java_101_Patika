import java.util.Scanner;

public class Uslu_Hesap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2, temp = 1;
		System.out.print("Üssü Alınacak Sayıyı Giriniz: ");
		number1 = input.nextInt();
		System.out.print("Üs Dercesini Giriniz: ");
		number2 = input.nextInt();
		if(number2<0) {
			for (int i = 0; i > number2; i--) {
				temp *= number1;
			}
			System.out.println("1/"+temp);
		}else {
			for (int i = 1; i <= number2; i++) {
				temp *= number1;
			}
			System.out.println(temp);
		}
	}

}
