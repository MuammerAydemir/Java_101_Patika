import java.util.Scanner;

public class Kullanici_Girisi {

	public static void main(String[] args) {
		String kadi,passwd,resetPasswd,newPasswd;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Kullanıvı Adı: ");
		kadi=input.nextLine();
		System.out.print("Şifre: ");
		passwd=input.next();
		System.out.println(passwd);
		if(kadi.equals("patika")&&passwd.equals("java123")) {
				System.out.println("Giriş yaptınız !");
		}
		else if(!passwd.equals("java123")) {
			System.out.println("Şifreniz Yanlış Sıfırlamak için 'sıfırla' yazınız: ");
			resetPasswd=input.next();
			if(resetPasswd.equals("sıfırla")) {
				System.out.print("Yeni Parola: ");
				newPasswd=input.next();
				if(!(newPasswd.equals(passwd))&&!(newPasswd.equals("java123"))) {
					System.out.println("Şifre oluşturuldu");
				}
				else
					System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
			}
			else
				System.out.println("Bilgileriniz Yanlış !");
		}
		else
			System.out.println("Kullanıcı Adınız Yanlış!");
		
		
	}

}
