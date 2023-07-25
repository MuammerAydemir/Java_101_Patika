package Mayin_Tarlasi;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int rowSize = scanner.nextInt();

        System.out.print("Sütun sayısını giriniz: ");
        int colSize = scanner.nextInt();

        MineSweeper game = new MineSweeper(rowSize, colSize);
        game.play();
    }

}
