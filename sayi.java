import java.util.Scanner;

public class sayi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a,toplam=0,adet=0;
        double ort;

        System.out.println("Sayı Giriniz :");
        a=inp.nextInt();

        for (int b =0;b<a;b++){

            if (b%12==0){
                toplam +=b;
                adet++;
            }
        }
        ort =toplam/(adet-1);
        System.out.println("Sayıların toplamı :"+ toplam);
        System.out.println("Sayıların Ortalaması :" + ort);





    }
}
