package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;

        do {
            System.out.print("Bir Sayı Giriniz: ");
            number = scanner.nextInt();
            if (number % 2 == 0 && number % 4 == 0) {
                total += number;

            }else if (number % 2 ==1){
                break;
            }

        } while (number > 0);
        System.out.println("Total : " + total);
    }
}