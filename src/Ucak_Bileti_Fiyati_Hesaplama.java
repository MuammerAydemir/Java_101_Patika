import java.util.Scanner;

public class Ucak_Bileti_Fiyati_Hesaplama {

	public static void main(String[] args) {
		int km,age,tripType;
		Scanner input=new Scanner(System.in);
		System.out.print("Mesafeyi km türünden giriniz : ");
		km=input.nextInt();
		System.out.print("Yaşınızı giriniz : ");
		age=input.nextInt();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
		tripType=input.nextInt();
		
		double total=km*0.10;
		
		if(km>0&&age>0&&(tripType==1||tripType==2)) {
			
			if(age<12) {
				total-=(total*0.5);
			}else if(age>=12&&age<=24) {
				total-=(total*0.1);
			}else if(age>65) {
				total-=(total*0.3);
			}
			
			if(tripType==2) {
				total-=(total*0.2);
				total*=2;
			}
			System.out.println("Toplam Tutar = "+total+" TL");
		}else {
			System.out.println("Hatalı Veri Girdiniz !");
		}
		

	}

}
