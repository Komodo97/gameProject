import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int gameNu =0;
        do {
            System.out.println("Oynamak istediğiniz oyunun kodunu giriniz\n1-)Estimator\n2-)Dice\n3-)Çıkış");
            Scanner scanner = new Scanner(System.in);
            gameNu = scanner.nextInt();
            if (gameNu == 1){
                Estimator estimator = new Estimator();
                estimator.estimate();
            } else if (gameNu == 2) {
                Dice dice = new Dice();
                dice.roll();
            } else if (gameNu ==3) {
                System.out.println("Hoşçakall");

            } else {
                System.out.println("Hatalı giriş yaptınız :((((");
            }

        }while (gameNu!=3);



        }

    }