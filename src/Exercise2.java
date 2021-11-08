import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter a second number :");
        int secondNumber = scanner.nextInt();
        if ((firstNumber+secondNumber)%2==0){
            System.out.println("The sum of the numbers is even !");
        } else {
            System.out.println("The sum of the numbers in odd !");
        }
    }
}
