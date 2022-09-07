import java.util.Scanner;

public class CiftVeDort {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number, total=0;

        do {
            System.out.println("Please enter the number :");
            number = inp.nextInt();
            if (number % 2 == 0 && number % 4 == 0) {
                total += number;
            }

        }while (number % 2 == 0);

        System.out.println("Toplam:" +total);
    }
}
