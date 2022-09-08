import java.util.Scanner;

public class MaxMinSayi {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int counter, number, min = 1, max = 1;

        System.out.print("How many numbers will you enter : ");
        counter =inp.nextInt();

        for (int i = 1; i <= counter; i++){
            System.out.print(i + "Enter First Number : " );
            number = inp.nextInt();

            if(i == 1){
                max = number;
                min = number;
            }

            if (number > max ){
                max = number;
            }
            if (number < min){
                min = number;

            }
        }
        System.out.println("Largest Number : " + max);
        System.out.println("Smallest Number :" + min);
    }
}
