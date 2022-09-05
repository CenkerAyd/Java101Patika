import java.util.Scanner;

public class ArtikYilHesap {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yıl, artıkyıl;

        System.out.println("Bir Yıl Giriniz :");
        yıl = inp.nextInt();

        if (yıl % 100 == 0) {
            if (yıl % 400 == 0) {
                System.out.println(yıl + "Bir artık yıldır.");
            } else {
                System.out.println(yıl + "Bir Artık yıl değildir.");
            }
        } else if (yıl%4==0){
            System.out.println(yıl +  "Bir artık yıldır");
        }else {
            System.out.println(yıl + "Artık Yıl Değildir.");
        }




    }
}
