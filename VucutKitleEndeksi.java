import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        Scanner girdi =new Scanner(System.in);

        double m,kg,vke;
        System.out.println("Boyunuzu Giriniz : ");
        m =girdi.nextDouble();

        System.out.println("Kilonuzu Giriniz : ");
        kg =girdi.nextDouble();

        vke =kg/(m*m);

        System.out.println("Vücüt Kitle Endeksi : " + vke);
    }
}
