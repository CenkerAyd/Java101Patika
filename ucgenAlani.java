import java.util.Scanner;

public class ucgenAlani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a,b,c,u,çevre,alan;

        System.out.println("1.kenarı giriniz : ");
        a =input.nextDouble();

        System.out.println("2.kenarı giriniz : ");
        b=input.nextDouble();

        System.out.println("3.kenarı giriniz : ");
        c=input.nextDouble();

        u =(a+b+c)/2;
        çevre =2*u;
        alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Çevre : "+ çevre);
        System.out.println("Alan : "+ alan);



    }
}
