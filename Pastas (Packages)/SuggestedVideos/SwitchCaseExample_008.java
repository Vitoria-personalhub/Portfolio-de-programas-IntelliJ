package SuggestedVideos;

import java.util.Scanner;
public class SwitchCaseExample_008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day of the week (in range of 1 to 7): ");
        int dayOfWeek = input.nextInt();

        String dayName = switch (dayOfWeek) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println("The day of the week is: " + dayName);
    }
}