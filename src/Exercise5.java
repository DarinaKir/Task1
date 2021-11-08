import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        int stop= 0 ;
        Scanner scanner = new Scanner(System.in);
        do {
            int workingType=0;
            do {
                System.out.println("Hello ! If you are a junior employee enter 0 and if you are a senior employee enter 1: ");
                workingType = scanner.nextInt();
            }while ((workingType!=0) && (workingType!=1));
            System.out.println("Type your number of working hours: ");
            int hoursWorking = scanner.nextInt();
            System.out.println("How many days did you manage to reach your goal?");
            int goalsAmount = scanner.nextInt();
            System.out.println("Your salary is : " + wage(workingType, hoursWorking, goalsAmount));
            System.out.println("If you have finished type -1, if not type another number0:");
            stop = scanner.nextInt();
        } while (stop!=-1);
    }

    public static int wage (int workingType, int hoursAmount, int goalsAmount){
        int sumOfWage = 0;
        if (workingType == 0){
            sumOfWage = hoursAmount*50;
        }else{
            sumOfWage = hoursAmount*200;
        }
        sumOfWage+=(goalsAmount*250);
        return sumOfWage;
    }
}
