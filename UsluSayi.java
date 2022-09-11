import java.util.Scanner;

public class UsluSayi {

    static int power (int x,int y){
        int result=1;
        if (x ==0 || y==0){
            return 1;
        }
        return x*power(x,y-1);

    }

    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        int x,y;
        System.out.println("Taban Değerini Giriniz :");
        x=inp.nextInt();
        System.out.println("Üs Değerini Giriniz :");
        y=inp.nextInt();

        System.out.println("Result :" +power(x,y));
    }
}
