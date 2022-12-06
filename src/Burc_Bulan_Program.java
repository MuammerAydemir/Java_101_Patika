import java.util.Scanner;

public class Burc_Bulan_Program {
	
	private static Scanner input;

	public static void main(String[] args) {
		int gun,ay;
		//String ay;
		String burc = "";
		boolean isError = false;
		input = new Scanner(System.in);
		System.out.print("Doğduğunuz Ay: ");
		ay=input.nextInt();
		System.out.print("Doğduğunuz Gün: ");
		gun=input.nextInt();
		if(ay==1) {
			if((gun>=1)&&(gun<=31)) {
				if(gun<22)
					System.out.println("Oğlak");
				else
					System.out.println("Kova");
			}else
				isError=true;	
		}
		if(ay==2) {
			if((gun>=1)&&gun<=28) {
				if(gun<20)
					burc="Kova";
				else
					burc="Balık";
			}else
				isError=true;	
		}
		if(ay==3) {
			if((gun>=1)&&(gun<=31)) {
				if(gun<21)
					if(gun<21)
						burc="Balık";
					else
						burc="Koç";
			}else
				isError=true;	
		}
		if(ay==4) {
			if((gun>=1)&&(gun<=31)) {
				if(gun<21)
					burc="Koç";
				else
					burc="Boğa";
			}else
				isError=true;	
		}
		if(ay==5) {
			if((gun>=1)&&(gun<=31)) {
				if(gun<21)
					burc="Boğa";
				else
					burc="İkizler";
			}else
				isError=true;	
		}
		if(ay==6) {
			if((gun>=1)&&(gun<=31)) {
				if(gun<23)
					burc="İkizler";
				else
					burc="Yengeç";
			}else
				isError=true;	
		}
		if(ay==7) {
			if((gun>=1)&&(gun<=31)) {
				if(gun<23)
					burc="Yengeç";
				else
					burc="Aslan";
			}else
				isError=true;	
		}if(ay==8) {
			if((gun>=1)&&((gun<=31))) {
				if(gun<23)
					burc="Aslan";
				else
					burc="Başak";
			}else
				isError=true;	
		}
		if(ay==9) {
			if((gun>=1)&&(gun<=31)) {
				if(gun<23)
					burc="Başak";
				else
					burc="Terazi";
			}else
				isError=true;	
		}
		if(ay==10) {
			if((gun>=1)&&(gun<=31)) {
				if(gun<23)
					burc="Terazi";
				else
					burc="Akrep";
			}else
				isError=true;	
		}
		if(ay==11) {
			if((gun>=1)&&(gun<=31)) {
				if(gun<22)
					burc="Akrep";
				else
					burc="Yay";
			}else
				isError=true;	
		}
		if(ay==12) {
			if((gun>=1)&&(gun<=31)) {
				if(gun<22)
					burc="Yay";
				else
					burc="Oğlak";
			}else
				isError=true;	
		}
		if(isError) {
			System.out.println("Hatalı giriş yaptınız!!!");
		}else
			System.out.print("Burcunuz: "+burc);
		
	}

}
