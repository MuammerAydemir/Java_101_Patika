import java.util.Scanner;

public class Artik_Yil_Hesaplama {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int year;
		System.out.print("Yıl Giriniz : ");
		year=input.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					System.out.println(year+" bir artık yıldır !");
				}else
					System.out.println(year+" bir artık yıl DEĞİLDİR!!");
			}else 
				System.out.println(year+" bir artık yıldır !");
		}else 
			System.out.println(year+" bir artık yıl DEĞİLDİR!!");
	}

}
