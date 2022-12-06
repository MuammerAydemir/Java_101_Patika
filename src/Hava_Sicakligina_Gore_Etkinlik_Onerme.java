import java.util.Scanner;

public class Hava_Sicakligina_Gore_Etkinlik_Onerme {

	private static Scanner input;

	public static void main(String[] args) {
		double sicaklik;
		input = new Scanner(System.in);
		System.out.print("Sıcaklık giriniz: ");
		sicaklik=input.nextDouble();
		
		if(sicaklik<5) 
			System.out.println(">> Kayak yapabilirsiniz.");
			
		else if(sicaklik<=15) 
			System.out.println(">> Sinemaya gidebilirsiniz.");				
			
		if(sicaklik>=10&&sicaklik<=25) 
			System.out.println(">> Pikniğe gidebilirsiniz.");
			
		else if(sicaklik>25)
				System.out.println(">> Yüzmeye gidebilirsiniz.");
		}
	}

