import java.util.Random;
import java.util.Scanner;

public class Dice {
    Dice(){
    }
    void roll(){
        System.out.println("Zar kaç köşeli??");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Random random = new Random();
        int x = random.nextInt(a);
        int y = random.nextInt(a);
        System.out.println("Senin zarın "+ (x+1) + " geldi");
        System.out.println("Benim zarım "+ (y+1) + " geldi");
        if (x>y){
            System.out.println("Sen kazandın :(");
        }
        else if (x<y){
            System.out.println("Ben kazandımmm :DDD");
        }
        else {
            System.out.println("Berabere hadi bidaa");
        }
    }
}
