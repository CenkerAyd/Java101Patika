import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
       int a,b,c;
       Scanner value =new Scanner(System.in);
        System.out.println("1.Sayıyı Giriniz : ");
        a=value.nextInt();

        System.out.println("2.Sayıyı Giriniz : ");
        b=value.nextInt();

        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");

        System.out.println("Hangi İşlemi Yapmak İstiyorsunuz : ");
        c=value.nextInt();

        if (a>=1 && a<=4){
        }else {
            System.out.println("Hatalı Giriş Yaptınız");
        }

        if (b>=1 && b<=4){
        }else {
            System.out.println("Hatalı Giriş Yaptınız");
        }

        if (a/b==0){
            System.out.println("Hatalı Giriş Yaptınız!");
            System.out.println("Yeniden Sayı Giriniz");
        }

        if (c==1){
            System.out.println("Sonuç :" +(a+b));
        }else if (c==2){
            System.out.println("Sonuç : " + (a-b));
        }else if (c==3){
            System.out.println("Sonuç : "+(a*b));
        }else if (c==4){
            System.out.println("Sonuç : " +(a/b));
        }

        System.out.println("-------------------------------");
        //Üstteki programın Switch-Case ile yapımı



    }

}
