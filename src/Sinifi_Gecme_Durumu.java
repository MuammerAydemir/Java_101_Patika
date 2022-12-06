import java.util.Scanner;

public class Sinifi_Gecme_Durumu {

	private static Scanner input;

	public static void main(String[] args) {
		int mat,fizik,turkce,kimya,muzik;
		input = new Scanner(System.in);
		System.out.print("Matematik notunuz: ");
		mat=input.nextInt();
		mat=(mat>0 && mat<100)?mat:0;
		
		System.out.print("Fizik notunuz: ");
		fizik=input.nextInt();
		fizik=(fizik>0 && fizik<100)?fizik:0;
		
		System.out.print("Türkçe notunuz: ");
		turkce=input.nextInt();
		turkce=(turkce>0 && turkce<100)?turkce:0;
		
		System.out.print("Kimya notunuz: ");
		kimya=input.nextInt();
		kimya=(kimya>0 && kimya<100)? kimya:0;
		
		System.out.print("Müzik notunuz: ");
		muzik=input.nextInt();
		muzik=(muzik>0 && muzik<100)?muzik:0;
		
		
		double avaregee=(mat+fizik+turkce+kimya+muzik) / 5;
		
		if(avaregee>55.0) {
			System.out.println("Sınıfı geçtiniz :D");
		}
		else
			System.out.println("Sınıfta kaldınız :(");
		
		System.out.println("Ortalamanız: "+avaregee);
		
		
	}

}
