package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üçgenin yarı çapını giriniz: ");
        int n = scanner.nextInt();
        int toplam = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--){
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2*i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
