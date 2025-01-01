import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi <= 1) {
            System.out.println(sayi + "sayısı ASAL değildir.");
        } else {
            if (asalKontrol(sayi, 2)) {
                System.out.println(sayi + " sayısı ASALDIR.");
            } else {
                System.out.println(sayi + " sayısı ASAL değildir.");
            }
        }
    }

    static boolean asalKontrol(int sayi, int bolen) {
        if (bolen * bolen > sayi) {
            return true;
        }
        if (sayi % bolen == 0) {
            return false;
        }
        return asalKontrol(sayi, bolen + 1);
    }
}
