import java.util.Scanner;
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("On what day are you interested in coming to the IRS offices? (Type 1-7) :");
        int desiredDay = scanner.nextInt();
        switch (desiredDay){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Type the early time you can arrive : ");
                int earlyHour = scanner.nextInt();
                System.out.println("Type the latest time you can arrive : ");
                int latestHour = scanner.nextInt();
                if ((earlyHour<0) || (earlyHour>23) || (latestHour<0) || (latestHour>23)){
                    System.out.println("The time you selected is invalid");
                }else if (earlyHour>latestHour){
                    System.out.println("Error ! The earlier time is greater than later!");
                }else {
                    if ((desiredDay!=3) &&((earlyHour<9) || (earlyHour>17) || (latestHour<9) || (latestHour>17))) {
                        System.out.println("On this day the IRS works only between 9 and 17.");
                    }else if ((earlyHour<8) || (earlyHour>12) || (latestHour<8) || (latestHour>12)){
                        System.out.println("On this day the IRS works only between 8 and 12.");
                    }else {
                        System.out.println("You will be successfully scheduled for day " + desiredDay + " between "+earlyHour+ " and "+ latestHour);
                    }
                }
                break;
            case 6:
            case 7:
                System.out.println("Income tax offices do not work on weekends");
                break;
            default:
                System.out.println("Number of day that you typing is invalid");
        }
    }
}
