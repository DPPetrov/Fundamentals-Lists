import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(sc.nextLine());
        int[] numbersToReverse = new int[numberOfLines];

        for (int i = 0; i < numbersToReverse.length; i++) {

            int userInput = Integer.parseInt(sc.nextLine());
            numbersToReverse[i] =  userInput;
        }

        for (int i = numbersToReverse.length; i > 0 ; i--) {

            System.out.print(numbersToReverse[i - 1] + " ");
        }

    }
}
