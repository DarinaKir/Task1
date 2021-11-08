import java.util.Scanner;
public class Exercise6 {
    public static void mathematicalSeries (int firstNum , int difference, int amount){
        for (int i = 0; i < amount; i++) {
            System.out.print((firstNum+(i*difference)) + ", ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number of the series (integer) :");
        int firstNumber = scanner.nextInt();
        System.out.println("Type the series difference (integer) :");
        int difference = scanner.nextInt();
        System.out.println("Type the amount of numbers in the series (integer and positive) :");
        int amountOfSeries = scanner.nextInt();
        while (amountOfSeries<=0){
            System.out.println("Something wrong... type again the amount of numbers (integer and positive) :");
            amountOfSeries=scanner.nextInt();
        }
        mathematicalSeries(firstNumber,difference,amountOfSeries);
    }
}
