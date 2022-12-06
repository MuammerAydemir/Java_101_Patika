import java.util.Scanner;

public class KDV_Tutari_Hesaplayan_Program {

	public static void main(String[] args) {
		double tutar, kdvOran=0.18,kdvTutari,kdvliTutar;
		Scanner input = new Scanner(System.in);
		System.out.print("Ücret Tutarını Giriniz: ");
		tutar=input.nextDouble();
		kdvOran=(tutar>0&&tutar<1000)?0.18:0.8;
		kdvTutari=tutar*kdvOran;
		kdvliTutar=tutar+kdvTutari;
		System.out.println("KDV Oranı: "+kdvOran);
		System.out.println("KDV Tutari: "+kdvTutari);
		System.out.println("KDV'li Fiyat: "+kdvliTutar);
		

	}

}
