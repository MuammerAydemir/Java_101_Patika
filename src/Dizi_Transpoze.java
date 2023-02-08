import java.util.Scanner;

public class Dizi_Transpoze {

	public static void main(String[] args) {
		String cızgı="<--------->";
		Scanner input=new Scanner(System.in);
		System.out.print("Dizinin satır sayısını giriniz: ");
		int t=input.nextInt();
		System.out.print("Dizinin sutün sayısını giriniz: ");
		int y=input.nextInt();
		System.out.println(cızgı);
		int[][] array = new int[t][y];
		for(int t1=0;t1<t;t1++) {
			for(int y1=0;y1<y;y1++) {
				System.out.print("Eleman: ");
				array[t1][y1]=input.nextInt();
			}
		}
		System.out.println(cızgı);
		int[][] newArray=new int[array[0].length][array.length];
		
        for (int i = 0; i < array[0].length ; i++) {
            for (int j = 0; j <array.length ; j++) {
            	newArray[i][j]=array[j][i];
            }
        }
        for (int i = 0; i < newArray.length ; i++) {
            for (int j = 0; j <newArray[0].length ; j++) {

                System.out.print(newArray[i][j]+ " ");
            }
            System.out.println();

        }
	}

}
