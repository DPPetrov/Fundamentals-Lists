import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = Integer.parseInt(sc.nextLine());

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
                , "Saturday", "Sunday"};

        if (day > days.length || day < 1) {
            System.out.println("Invalid day!");

        } else {

            System.out.println(days[day - 1]);

        }

    }
}
