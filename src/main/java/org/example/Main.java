import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       String username, password;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Username: ");
       username = scanner.nextLine();
       System.out.print("Password: ");
       password = scanner.nextLine();

       if (username.equals("admin") && password.equals("admin123")) {
           System.out.println("Hoşgeldin Admin!");
       }
       else {
           System.out.println("Şifre veya kullanıcı adı yanlış");
       }
    }
}