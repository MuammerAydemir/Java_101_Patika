import java.util.Scanner;

public class Dik_Ucgende_Hipotenus_Bulan_Program {

	public static void main(String[] args) {
		//Hipotenüs Hesaplama
		double a,b,c,temp,alan;
		Scanner input=new Scanner(System.in);
		System.out.print("Dik kenarı giriniz: ");
		a=input.nextDouble();
		System.out.print("Dik kenarı giriniz: ");
		b=input.nextDouble();
		c=Math.sqrt((a*a)+(b*b));
		System.out.println("Hipotenüs: "+c);
		//Alan Hesaplama
		System.out.print("Üçüncü kenarı giriniz: ");
		c=input.nextDouble();
		temp=(a+b+c)/2;
		alan=Math.sqrt(temp*(temp-a)*(temp-b)*(temp-c));
		System.out.println("Alan: "+alan);
	}

}
