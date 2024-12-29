import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        int ilk = 0, ikinci = 1;

        System.out.println("Fibonacci Hesaplaması:");
        for (int i = 1; i <= elemanSayisi; i++) {
            int yeni = ilk + ikinci;
            System.out.println(ilk + " + " + ikinci + " = " + yeni);
            ilk = ikinci;
            ikinci = yeni;
        }

        scanner.close();
    }
}
