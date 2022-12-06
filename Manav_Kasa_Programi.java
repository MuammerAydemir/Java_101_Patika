import java.util.Scanner;

public class Manav_Kasa_Programi {

	public static void main(String[] args) {
		double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5,sonuc=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Armut Kaç Kilo ? : ");
		sonuc+=armut*(input.nextDouble());
		System.out.print("Elma Kaç Kilo ? : ");
		sonuc+=elma*(input.nextDouble());
		System.out.print("Domates Kaç Kilo ? : ");
		sonuc+=domates*(input.nextDouble());
		System.out.print("Muz Kaç Kilo ? : ");
		sonuc+=muz*(input.nextDouble());
		System.out.print("Patlıcan Kaç Kilo ? : ");
		sonuc+=patlican*(input.nextDouble());
		System.out.println("Toplam Tutar : "+sonuc+" TL");
		
	}

}
