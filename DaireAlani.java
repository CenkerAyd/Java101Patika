import java.util.Scanner;

public class DaireAlani {

    public static void main(String[] args) {
        //TÜM DAİRE ALANINI HESAPLAMA
        Scanner input =new Scanner(System.in);

        double pi=3.14,r,alan,çevre;

        System.out.println("Dairenin Yarıçapını Giriniz :");
        r=input.nextDouble();

        alan =pi*r*r;
        çevre=2*pi*r;

        System.out.println("Daire Çevresi :"+ çevre);
        System.out.println("Daire Alanı :" + alan);

     //DAİRE DİLİM ALANINI HESAPLAMA
        System.out.println("-------------------------------------------");

        Double dilimalani,açı;
        System.out.println("Dilimin açısını giriniz : ");
        açı =input.nextDouble();

        dilimalani = (pi * (r*r) * açı) / 360;

        System.out.println("Açı Ölçüsü : " + açı );
        System.out.println("Dilim Alanı : " +dilimalani);


    }
}
