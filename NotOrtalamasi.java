import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik,fizik,kimya,biyoloji,tarih,edebiyat,müzik;

        System.out.println("Matematik notunu giriniz : ");
        matematik=input.nextInt();

        System.out.println("Fizik notunu giriniz : ");
        fizik=input.nextInt();

        System.out.println("Kimya notunu giriniz : ");
        kimya=input.nextInt();

        System.out.println("Biyoloji notunu giriniz : ");
        biyoloji=input.nextInt();

        System.out.println("Tarih notunu giriniz : ");
        tarih=input.nextInt();

        System.out.println("Edebiyat notunu giriniz : ");
        edebiyat=input.nextInt();

        System.out.println("Müzik notunu giriniz : ");
        müzik=input.nextInt();
        double sonuc=(matematik+fizik+kimya+biyoloji+tarih+edebiyat+müzik) /7;

        if (sonuc>=70){
            System.out.println("Tebrikler Sınıfı Geçtiniz.");
        }else {
            System.out.println("Maalesef sınıfı geçemediniz");
        }
    }
}
