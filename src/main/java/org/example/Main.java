package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sıcaklık değeri girin: ");
        heat = scanner.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz");
        }
        else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya Gidebilirsiniz");
        }
        else if (heat > 15 && heat <= 25) {
            System.out.println("Piknik yapabilirsiniz");
        }
        else if (heat > 25) {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}
