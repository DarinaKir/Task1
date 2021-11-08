import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        int selectedNum = enterANumber();
        starTriangle(selectedNum);
    }

    public static int enterANumber (){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("Type a number in the range of 5-20 (inclusive)");
            number=scanner.nextInt();
        }while (number>20 || number<5);
        return number;
    }

    public static void starTriangle (int numOfRows){
        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
