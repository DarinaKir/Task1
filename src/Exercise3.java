import java.util.Scanner;
public class Exercise3 {
    public static final int NUM_NUMBERS = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers (type 'Enter' after each one):");
        int [] numbers = new int[NUM_NUMBERS];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int interimNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i]<numbers[j]){
                    interimNumber = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = interimNumber;
                }
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ ", ");
        }
    }
}
