import java.util.Scanner;

public class havaSicaklik {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int heat;
        System.out.println("Sıcaklık Derecesini Giriniz :");
        heat =inp.nextInt();

        if (heat<5){
            System.out.println("Hava Soğuk. Evde Vakit Geçirebilirsiniz");
        }else if ( (heat>=5)&&(heat<=10)) {
            System.out.println("Dışarda dolaşabilirsiniz.");
        }else if ((heat>=10) &&(heat<=15)){
            System.out.println("Dışarda dolaşabilirsiniz veya piknik yapabilirsiniz.");
        } else if ((heat >= 15)&&(heat<=25)){
            System.out.println("Piknik Yapabilirsiniz");
        }else {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }

    }

}
