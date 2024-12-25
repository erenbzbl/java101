package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ********* Girilen Değerin basamaklarının toplamı *********

        /*System.out.print("Bir Sayı Giriniz: ");
        int number = scanner.nextInt();
        int toplam = 0;

        while (number != 0) {
            int digit = number % 10;
            toplam += digit;
            number = number / 10;
            System.out.println(toplam);
        } */

        // ********* - Girilen Değerin basamaklarının toplamı bitiş-  *********


        for (int x =1; x <= 999; x++)
        {
          int number = x;
          int toplam = 0;
          int basamakSayi = 0;

          int  tempNumber = x;
          while (tempNumber > 0) {
              tempNumber = tempNumber / 10;
              basamakSayi++;
          }

          int sumNumber = x;
          while (sumNumber > 0) {
               int  basamak = sumNumber % 10;
               int  us = 1;

               for(int i = 0; i < basamakSayi; i++ ){
                   us = basamak * us;
               }

               toplam =toplam + us;
               sumNumber = sumNumber / 10;
          }

          if (toplam == number){
              System.out.println(number + " armstrong sayıdır" );
          }
        }
    }
}
