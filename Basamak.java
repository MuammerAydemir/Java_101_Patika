import java.util.Scanner;

public class Basamak {

	public static void main(String[] args) {
		int number, basNumber = 0,temp=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz: ");
		number = input.nextInt();
		while (number != 0) {
			temp+=(number%10);
			number /= 10;	
		}
		System.out.println("Toplam: "+temp);
	}
}
