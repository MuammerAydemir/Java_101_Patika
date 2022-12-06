import java.util.Scanner;

public class Dairenin_Alanini_ve_Cevresini_Hesaplayan_Program {
	public static void main(String[] args) {
		final float PI=3.14f;
		float r,alan,cevre,alfa;
		Scanner input=new Scanner(System.in);
		System.out.print("Daire Yarıçapı Giriniz: ");
		r=input.nextFloat();
		alan=PI*r*r;
		cevre=2*PI*r;
		System.out.print("Daire Alanı: "+alan+"\n"+"Daire Çevresi: "+cevre+"\n");
		
		//Daire dilimi alanı
		System.out.print("Merkezaçı ölçücü giriniz: ");
		alfa=input.nextFloat();
		double temp=(PI*(r*r)*alfa)/360;
		System.out.print("merkez açısının ölçüsü verilen daire diliminin alanı: "+temp);
		
		
		
	}

}
