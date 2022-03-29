import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberCalculations numCalcObject = new NumberCalculations();

        //user entry
        System.out.println("Enter a number between 1 and 100");
        int userNum = scanner.nextInt();

        //computer entry
        int computerNum = (int)(Math.random() * ((100 - 1) + 1)) + 1;

        //display results
        System.out.println("And the results are: ");
        System.out.println(" ");
        System.out.println("Your guess: " + userNum + "\nThe computer's guess: " + computerNum);
        System.out.println(" ");

        //compare user's guess and computer's guess.  Display winner.
        numCalcObject.numCalc(userNum, computerNum);

    }
}
