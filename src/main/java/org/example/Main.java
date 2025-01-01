package org.example;

import java.util.Scanner;

public class Main {
    static void number(int sayi){
        System.out.print(sayi + " ");

        if(sayi > 0){
            number(sayi - 5);
            System.out.print(sayi + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

       number(sayi);
    }
}



