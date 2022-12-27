import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random random=new Random();
        int randomNumber =random.nextInt(100);
        System.out.println("Welcome to number guess game.");
        Scanner sc=new Scanner(System.in);
        int right =0;
        int guessNumber;
        int[]wrong=new int[5];
        boolean isWin=false;
        boolean isWrong=false;

        while (right <5){
            System.out.print("Please enter the number: ");
            guessNumber =sc.nextInt();

            if (guessNumber <0 || guessNumber >100){
                System.out.println("Please enter the number between 1-100!");
                if (isWrong){
                    right++;
                    System.out.println("You made too many incorrect entries. Remaining right: " +(5- right));
                }else {
                    isWrong=true;
                    System.out.println("If you enter incorrectly again, you will be deducted from your rights.");
                }
                continue;
            }

            if (guessNumber == randomNumber){
                System.out.println("Congratulations.You won the game");
                System.out.println("Correct Number:" + randomNumber);
                break;
            }else {
                System.out.println("İncorrect Number.Try Again");
                if (guessNumber > randomNumber){
                    System.out.println(guessNumber +" is greater than random number.");
                }else {
                    System.out.println(guessNumber +" is smaller than random number.");
                }
                wrong[right++]= guessNumber;
                System.out.println("Remaining right: "+(5- right));
                }

            System.out.println("------------");
        }
        if (!isWin){
            System.out.println("You lose!");
            if (!isWrong){
                System.out.println("Your guess :" + Arrays.toString(wrong));
                }
            }
        }
    }
