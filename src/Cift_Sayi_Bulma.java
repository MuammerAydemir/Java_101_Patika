import java.util.Scanner;

public class Cift_Sayi_Bulma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number,total=0,sayac=0;
		System.out.print("Bir Sayı Giriniz: ");
		number=input.nextInt();
		for (int i = 0; i < number; i++) {
			if(i%2==0)
				System.out.print(i+", ");
			if((i%3==0)&&(i%4==0)) {
				total+=i;
				sayac++;
			}
			if(i==number-1)
				System.out.print("\n"+total/sayac);
		}
	}
}
