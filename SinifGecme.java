import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        Double mat ,tr,fizik,kimya,müzik;
        double toplam =0;
        double dersSayisi =0;
        double geçmeNotu =0;

        System.out.println("Mat Notunuzu Giriniz :");
        mat =inp.nextDouble();

        System.out.println("Türkçe Notunuzu Giriniz :");
        tr=inp.nextDouble();

        System.out.println("Fizik Notunuzu Giriniz :");
        fizik =inp.nextDouble();

        System.out.println("Kimya Notunuzu Giriniz :");
         kimya=inp.nextDouble();

        System.out.println("Müzik Notunuzu Giriniz :");
        müzik =inp.nextDouble();

        if ((mat>=0) &&(mat<=100)){
            toplam +=mat;
            dersSayisi++;
        }else{
            dersSayisi++;
        }
        if ((tr>=0) &&(tr<=100)){
            toplam +=tr;
            dersSayisi++;
        }else{
            dersSayisi++;
        }
        if ((fizik>=0) &&(fizik<=100)){
            toplam +=fizik;
            dersSayisi++;
        }else{
            dersSayisi++;
        }
        if ((kimya>=0) &&(kimya<=100)){
            toplam +=kimya;
            dersSayisi++;
        }else{
            dersSayisi++;
        }
        if ((müzik>=0) &&(müzik<=100)){
            toplam +=müzik;
            dersSayisi++;
        }else{
            dersSayisi++;
        }

            geçmeNotu =toplam/dersSayisi;
        if (geçmeNotu<=55){
            System.out.println("Sınıfı Geçemediniz.");
        }else{
            System.out.println("Tebrikler Sınıfı Geçtiniz.Geçme Notunuz :" +geçmeNotu);
        }


    }
}
