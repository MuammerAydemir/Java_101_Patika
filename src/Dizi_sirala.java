import java.util.*;
public class Dizi_sirala {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Dizinin boyutu n : ");
		int n=input.nextInt();
		int[] liste=new int[n];
		
		for (int i = 0; i < liste.length; i++) {
			System.out.println("Dizinin elemanlarını giriniz :");
			System.out.print(i+1+". Eleman: ");
			int eleman=input.nextInt();
			liste[i]=eleman;
		}
		Arrays.sort(liste);
		System.out.println(Arrays.toString(liste));
	}

}
