import java.util.Scanner;

public class Hesap_Makinesi {

	public static void main(String[] args) {
		double number1,number2;
		int selectt;
		Scanner input = new Scanner(System.in);
		System.out.print("Bir Sayı Giriniz: ");
		number1=input.nextDouble();
		System.out.print("Bir Sayı Giriniz: ");
		number2=input.nextDouble();
		
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("Seçiniz: ");
		
		selectt=input.nextInt();
		switch (selectt) {
		case 1:
			System.out.println("Toplam: "+(number1+number2));
			break;
		case 2:
			System.out.println("Fark: "+(number1-number2));
			break;
		case 3:
			System.out.println("Çarpım: "+(number1*number2));
			break;
		case 4:
			if(number2!=0)
				System.out.println("Bölüm: "+(number1/number2));
			else
				System.out.println("Bir sayı sıfıra bölünemez!!");
			break;
		default:
			System.out.println("Yanlış seçim yaptınız!!!!");
			break;
		}
		
		
	}

}
