import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz?: ");
        int n = scanner.nextInt();

        System.out.print("1.Sayıyı Giriniz: ");
        int sayi = scanner.nextInt();

        int enBuyukSayi = 1;
        int enKucukSayi = 1;


        for (int i =2; i <= n; i++){
            System.out.print(i + ".Sayıyı Giriniz: ");
            sayi = scanner.nextInt();

            if (sayi > enBuyukSayi){
                enBuyukSayi = sayi;
            }if (sayi < enKucukSayi){
                enKucukSayi = sayi;
            }
        }
        System.out.println("En büyük sayı: " + enBuyukSayi + "\nEn küçük sayı: " + enKucukSayi);
    }
}
