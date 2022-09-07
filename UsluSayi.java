import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int a,b;
        System.out.println("Üssü alınacak sayıyı giriniz :");
        a= inp.nextInt();
        System.out.println("Üs olacak sayıyı giriniz");
        b=inp.nextInt();
        int total=1;

        for ( int c =1;c<=b;c++){
            total *=a;
        }
        System.out.println("Sonuç :" + total);
    }
}
