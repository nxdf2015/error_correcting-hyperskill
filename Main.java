package correcter;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Connection poorConnection = new PoorConnection();
         Coder coder = new CoderTriple();
         String message  = scanner.nextLine();


        String messageEncode = coder.encode(message);
        String messageError = poorConnection.send(messageEncode);

        System.out.println(message );
        System.out.println(messageEncode);
        System.out.println(messageError);
        System.out.println(coder.decode(messageError));

    }
}
