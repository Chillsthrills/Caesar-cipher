import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message to encode or decode:");
        String message = scan.nextLine();
        System.out.println("Enter a secret key (-25 to 25):");
        int keyVal = Integer.parseInt(scan.nextLine());
        SecretMessages secret = new SecretMessages();
        secret.encrypt(message, keyVal);
    }
}
