import java.util.Scanner;

public class basamakToplami {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int a;
        System.out.println("Bir sayı giriniz :");
        a=inp.nextInt();
        int total=0;

        int adet =0;
        while (a!=0){
            total=a% 10;


            a /=10;
            adet++;
        }
        System.out.println("Basamak Toplami :" +adet);
        System.out.println("Basamaklar Toplamı:" +total);

    }

}
