public class NumberCalculations{
    int winningNumber = (int)(Math.random() * ((100 - 1) + 1)) + 1;

    public void numCalc(int userNum, int computerNum){
        if(userNum == winningNumber){
            System.out.println("The number was " + winningNumber + "\nYou win!");
        }
        else if(computerNum == winningNumber){
            System.out.println("The number was " + winningNumber + "\nTry again!");
        }
        else if(userNum == winningNumber && computerNum == winningNumber){
            System.out.println("The number was " + winningNumber + "\nIt's a draw!");
        }
        else {
            System.out.println("The number was " + winningNumber + "\nNo winner; try again!");
        }
    }
}
