import java.util.Scanner;

public class kdvTutar {
    public static void main(String[] args) {
        double kdvsizfiyat,kdvyüzdesi,kdvtutari,kdvlifiyat;


        Scanner fiyat =new Scanner(System.in);
        System.out.println("Ürün Fiyatını Giriniz : ");
        kdvsizfiyat =fiyat.nextDouble();

        if (kdvsizfiyat<=1000){
             kdvyüzdesi =0.18;
             kdvtutari =kdvsizfiyat*kdvyüzdesi;
             kdvlifiyat=kdvsizfiyat+kdvtutari;
         }else {
             kdvyüzdesi = 0.08;
             kdvtutari = kdvsizfiyat*kdvyüzdesi  ;
             kdvlifiyat = kdvsizfiyat + kdvtutari;
         }

        System.out.println("Kdv tutarı : " + kdvtutari);
        System.out.println("Kdvli Fiyat : "+ kdvlifiyat);
        System.out.println("İyi Günler");
    }
}
