import java.util.Scanner;

public class TaksimetreHesap {
    public static void main(String[] args) {
        Scanner girdi =new Scanner(System.in);

        double a,b,minücret,açılış,toplamücret;


        System.out.println("KM miktarini giriniz : ");
        a= girdi.nextDouble();
        b=a*2.20;
        minücret=20;
        açılış=10;


        toplamücret=açılış+b;
        if (toplamücret<20){
            toplamücret=20;
        }else {
            toplamücret=açılış+b;
        }

        System.out.println("Açılış Tutarı : "+ açılış);
        System.out.println("Minimum Tutar : "+minücret);
        System.out.println("Toplam Ücret : " + toplamücret);


    }
}
