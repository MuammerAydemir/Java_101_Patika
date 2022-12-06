import java.util.Scanner;

public class Vucut_Kitle_Indeksi_Hesaplama {

	public static void main(String[] args) {
		double boy,kilo,sonuc;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		boy=input.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		kilo=input.nextDouble();
		sonuc=kilo/Math.pow(boy, 2);
		System.out.println("Vücut Kitle İndeksiniz : "+sonuc);
	}

}
