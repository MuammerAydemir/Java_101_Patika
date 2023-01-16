import java.util.*;
public class Dizi_Max_Min {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int[] liste = {15,12,788,1,-1,-778,2,0};
        int sayi=input.nextInt();
        int min = liste[0];
        int max = liste[0];
        int lessNear=0;
        int moreNear=0;
        for (int i : liste) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        for (int i : liste) {
            if (i<sayi) {
            	lessNear=i;
            	if(min<lessNear) {
            		min=lessNear;
            	}
            }
            if (i>sayi) {
            	moreNear=i;
            	if(max>moreNear) {
            		max=moreNear;
            	}
            }
            
        }
        System.out.println("Dizi : "+Arrays.toString(liste));
        System.out.println("Girilen Sayı : "+sayi);
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);
	}

}
