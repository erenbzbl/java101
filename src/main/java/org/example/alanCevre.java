import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double r;
        double alfa;
        double alan;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Merkez açısının ölçüsünü giriniz: ");
        alfa = input.nextDouble();

        alan = Math.PI * r * r * r * (alfa / 360);
        System.out.println("Daire diliminin alanı: " + alan);
    }
}
