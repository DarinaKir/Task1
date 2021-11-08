import java.util.Random;
import java.util.Scanner;
public class Exercise10 {
    public static final int NUMBER_OF_USERS = 2;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(1000)+1;
        int [] amountGuesses= new int[NUMBER_OF_USERS];
        int userGuess = 0;
        boolean end = false;
        do {
            for (int i = 1; i <=2 ; i++) {
                System.out.println("User "+ i +", type your guess: what is the number? (Range of 1-1000)");
                userGuess = scanner.nextInt();
                amountGuesses[i-1]++;
                if (userGuess==randomNumber){
                    System.out.println("User "+ i +" won after "+ amountGuesses[i-1] +" attempt/s !");
                    end=true;
                    break;
                }else {
                    wrongGuess(userGuess,randomNumber);
                }

            }
        }while (!end);
    }

    public static void wrongGuess( int guess, int randomNum){
        if (guess>randomNum){
            System.out.println("Your guess is too big.");
        }else {
            System.out.println("Your guess is too small.");
        }
    }
}
