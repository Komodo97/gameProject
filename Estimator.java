import java.util.Random;
import java.util.Scanner;
public class Estimator {
    Estimator() {

    }
    void estimate() {
        System.out.println("Kaça kadar sayı tutayım?");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        Random random = new Random();
        int a = random.nextInt(range);
        int number = a + 1;
        int tahmin = 0;
        while (number != tahmin) {
            System.out.println("Tahminini yaz");
            tahmin = scanner.nextInt();
            if (number == tahmin) {
                System.out.println("Tebriklerr");
            } else if (number < tahmin) {
                System.out.println("Küçültmelisin");

            } else if (number > tahmin) {
                System.out.println("Yükseltmelisin");

            } else {
                System.out.println("Yanlışş");
            }

        }
    }
}