import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        int min = 1;

        if (sayi1 == sayi2) {
            System.out.println("Ebob: " + sayi1);
            System.out.println("Ekok: " + sayi2);
        }else if (sayi1 > sayi2) {
            min = sayi2;
        } else if (sayi2 > sayi1) {
            min = sayi1;
        }

        int ebob = 1;

        while (min > 0) {
            if (sayi1 % min == 0 && sayi2 % min == 0) {
                ebob = min;
                break;
            }
            min--;
        }

        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}
