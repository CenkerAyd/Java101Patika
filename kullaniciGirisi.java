import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {

        String kullaniciİsmi,Şifre,yeniŞifre,evetHayir;
         Scanner inp=new Scanner(System.in);

        System.out.println("Kullanici Adınız : ");
        kullaniciİsmi =inp.nextLine();

        System.out.println("Şifreniz :");
        Şifre=inp.nextLine();

        if (kullaniciİsmi.equals("Beşiktaş")&& Şifre.equals("1903")){
            System.out.println("Giriş Yapıldı!");
        }else {
            System.out.println("Hatalı Şifre Girdiniz.Şifre sıfırlamak istiyor musunuz? Evet veya Hayır yazınız.");
            evetHayir=inp.nextLine();
            if (evetHayir.equals("Hayır")){
                System.out.println("Çıkış Yapıldı");
            }else if (evetHayir.equals("Evet")){
                System.out.println("Yeni Şifre Giriniz :");
                yeniŞifre=inp.nextLine();
                if (yeniŞifre.equals("1903")&& yeniŞifre.equals(Şifre)){
                    System.out.println("Yeni şifreniz eski şifreniz ve hatali girdiğiniz ile aynı olamaz.");
                }else {
                    System.out.println("Yeni Şifreniz Oluşturuldu!");
                }
            }
        }


    }
}
