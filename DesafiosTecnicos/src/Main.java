
//
import java.util.Scanner;
import java.io.IOException;

public class DoisValoresInteiros {

    public static void main(String[] args) throws IOException {
        Scanner dado = new Scanner(System.in);

        int A = dado.nextInt();
        int B = dado.nextInt();
        int X = A + B;
        System.out.println("X = " + X);
        dado.close();
    }
}
