import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a 'a' of a quadratic equation :");
        double a = scanner.nextInt();
        System.out.println("Type a 'b' of a quadratic equation :");
        double b = scanner.nextInt();
        System.out.println("Type a 'c' of a quadratic equation :");
        double c = scanner.nextInt();
        double insideRoot = (b*b) - (4*a*c);
        if (insideRoot<0){
            System.out.println("No solution was found for a quadratic equation.");
        }else if (insideRoot==0) {
            System.out.println("There is only one solution to a quadratic equation : X = " + (-b/(2*a)) );
        }else {
            System.out.println("The two solutions to a quadratic equation were found : ");
            System.out.println("X1 = " + ((-b +(Math.sqrt(insideRoot)))/(2*a)));
            System.out.println("X2 = " + ((-b -(Math.sqrt(insideRoot)))/(2*a)));
        }
    }
}
