import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class HesapMakinesiSwitchCase {
    public static void main(String[] args) {
        Scanner value =new Scanner(System.in);

        int a,b,c;

        System.out.println("1.Sayıyı Giriniz : ");
        a=value.nextInt();

        System.out.println("2.Sayıyı Giriniz");
        b= value.nextInt();


        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");

        System.out.println("Hangi İşlemi Yapmak İstiyorsunuz : ");
        c=value.nextInt();



        switch (c){
            case 1:
                System.out.println("Sonuç : "+(a+b));
                break;
            case 2:
                System.out.println("Sonuç : " +(a-b));
                break;
            case 3:
                System.out.println("Sonuç : " +(a*b));
                break;
            case 4 :
                if (b!=0){
                    System.out.println("Sonuç :" + (a/b));
                }else{
                    System.out.println("Başka Sayı Giriniz");
                }
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız");
        }
    }
}
