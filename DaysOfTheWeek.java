import java.util.Scanner;

public class DaysOfTheWeek {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = Integer.parseInt(sc.nextLine());

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"
        , "Saturday", "Sunday"};

        for (int i = day - 1; i <= days.length; i++) {

            if (i > days.length || i < 1){
                System.out.println("Invalid day!");
                break;
            }
            System.out.println(days[i]);
        }


    }
}
