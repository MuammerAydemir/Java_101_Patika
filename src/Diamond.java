import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number= klavye.nextInt();

        for (int i = 0; i <number; i++) {
            for (int j = 0; j < (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
            }
        
        for (int i = number-1; i >0; i--) {
            for (int j = (number - i+1); j >0 ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i*2); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
            }
        }
}
