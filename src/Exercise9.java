import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        int selectedNum = enterAPositiveNumber();
        for (int i = 2; i <= selectedNum; i++) {
            if (primeNumber(i)){
                System.out.print(i+", ");
            }
        }
    }

    public static boolean isDivisible (int firstNum, int secondNum){
        if (firstNum%secondNum==0){
            return true;
        }
        return false;
    }

    public static boolean primeNumber (int number){
        for (int i = 2; i < number; i++) {
            if (isDivisible(number,i)){
                return false;
            }
        }
        return true;
    }

    public static int enterAPositiveNumber (){
        Scanner scanner = new Scanner(System.in);
        int positiveNum = 0;
        do{
            System.out.println("Enter a positive number :");
            positiveNum=scanner.nextInt();
        }while (positiveNum<=0);
        return positiveNum;
    }
}
