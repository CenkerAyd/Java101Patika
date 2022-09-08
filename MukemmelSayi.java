import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        int a;
        int total =0;
        System.out.println("Sayı Giriniz :");
        a =inp.nextInt();

        for (int i=1;i<a;i++){
            if (a%i==0){
                total +=i;
            }
        }
        if (total==a){
            System.out.println(a + " " +"Bir Mükemmel Sayıdır.");
        }else {
            System.out.println(a + " " +"Bir Mükemmel Sayı Değildir");
        }

    }
}
