import java.util.Scanner;

public class AtmProje {
    public static void main(String[] args) {
        Scanner girdi =new Scanner(System.in);

        String userName, password;
        int hak=3;
        int secim;
        int paramiktari=3000;

        while (hak>0){
            System.out.println("Kullanıcı Adınız :");
            userName=girdi.nextLine();
            System.out.println("Şifreniz :");
            password=girdi.nextLine();

            if (userName.equals("CENKER AYDIN") && password.equals("12345")){
                System.out.println("Banka Hesabına Başarıyla Giriş Yapıldı.");
                System.out.println("Toplam Bakiyeniz:" +paramiktari);
            do {
                System.out.println("Hangi İşlemi Yapmak İstiyorsunuz? \n 1-Para Yatırma \n 2-Para Çekme \n 3-Kalan Bakiye \n 4-Çıkış Yap");
            secim=girdi.nextInt();
            switch (secim){
                case 1:
                    System.out.println("Yatırmak İstediğiniz Miktarı Giriniz :");
                    int miktar =girdi.nextInt();
                    System.out.println("Paranız Yatırıldı.");
                    paramiktari +=miktar;
                    System.out.println("Toplam Bakiyeniz:" +paramiktari);
                    break;
                case 2:
                    System.out.println("Çekmek İstediğiniz Parayı Giriniz :");
                    int miktar1 =girdi.nextInt();
                    if (miktar1>paramiktari){
                        System.out.println("Yetersiz Bakiye!");
                    }else{
                        System.out.println("Paranızı çektiniz.");
                        paramiktari -=miktar1;
                        System.out.println("Toplam Bakiyeniz :" + paramiktari);
                        break;
                    }
                case 3:
                    System.out.println("Kalan Bakiyeniz :" +paramiktari);
                    break;
            }
            }while (secim !=4);
                System.out.println("Çıkış Yapıldı.Tekrar Görüşmek Üzere");
                break;
            }else {
                hak--;
                System.out.println("Hatalı Giriş Denediniz.Tekrar Deneyiniz.");
                if (hak ==0){
                    System.out.println("Hesabınız Bloke Oldu.Bankayla İletişime Geçiniz.");
                }else {
                    System.out.println("Kalan hakkınız :" +hak);
                }
            }
        }
    }

}
