import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select the cryptographic algorithm:");
        System.out.println("1. RSA");
        System.out.println("2. AES");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        if (choice == 1) {
            RSAExample rsa = new RSAExample();
            rsa.run();
        } else if (choice == 2) {
            AESExample aes = new AESExample();
            aes.run();
        } else {
            System.out.println("Invalid choice.");
        }
        
        scanner.close();
    }
}
