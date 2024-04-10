import java.util.Scanner;

public class Guess_it_Game {
    public static void main(String[] args) {
           while(true) {
            System.out.print("guess the number below 100");
            System.out.println();
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            String num = String.valueOf(Integer.parseInt(String.valueOf(x)));
            String number = "";
            for (int i = 0; i < 2; i++) {
                number = number + (int) (Math.random() * 10);
            }
            if (num == number) {
                System.out.println("kehoo!! You have won the game");
            } else {
                System.out.println("computer has won the game .you lost it");
                System.out.println("the number was " + number);
            }
        }
    }
}
