import  java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a integer number :");
        int number = scanner.nextInt();
        if (number<0){
            number*=-1;
        }
        System.out.print("The absolute value is " + number);
    }
}
