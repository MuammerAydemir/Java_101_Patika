import java.util.Scanner;

public class Sayilari_Siralama {
	private static Scanner input;
	public static void main(String[] args) {
		int say1,say2,say3;
		input=new Scanner(System.in);
		System.out.print("1.Sayıyı giriniz: ");
		say1=input.nextInt();
		System.out.print("2.Sayıyı giriniz: ");
		say2=input.nextInt();
		System.out.print("3.Sayıyı giriniz: ");
		say3=input.nextInt();
		System.out.print("\n");
		if((say1>say2)&&(say1>say3)) {
			if(say2>say3)
				System.out.println("sayı1>sayı2>sayı3");
			else
				System.out.println("sayı1>sayı3>sayı2");
		}else if((say2>say1)&&(say2>say3)) {
			if(say1>say3)
				System.out.println("sayı2>sayı1>sayı3");
			else
				System.out.println("sayı2>sayı3>sayı1");
		}else if((say3>say1)&&(say3>say2)) {
			if(say1>say2)
				System.out.println("sayı3>sayı1>sayı2");
			else
				System.out.println("sayı3>sayı2>sayı1");
		}
	}

}
