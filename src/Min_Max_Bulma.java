import java.util.Scanner;

public class Min_Max_Bulma {

	public static void main(String[] args) {
		int number,minN=0,maxN=0,count;
		Scanner input=new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz: ");
		count=input.nextInt();
		System.out.println("");
		for (int i = 1; i <=count; i++) {
			System.out.print(i+". Sayıyı giriniz: ");
			number=input.nextInt();
			if(i==1) {
				maxN=number;
				minN=number;
			}
			else if (number>maxN) {
				maxN=number;
			}else if(number<minN&&number<maxN)
			{
				minN=number;
			}
		}
		System.out.println("\n"+"En büyük sayı: "+maxN);
		System.out.println("En küçük sayı: "+minN);

		
	}

}
