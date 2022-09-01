import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        Scanner değer =new Scanner(System.in);
double a,e,d,m,p,at,et,dt,mt,pt,tt;
        System.out.println("Armut kaç kilo : ");
        a =değer.nextDouble();

        System.out.println("Elma kaç kilo : ");
        e=değer.nextDouble();

        System.out.println("Domates kaç kilo  :");
        d=değer.nextDouble();

        System.out.println("Muz kaç kilo : ");
        m=değer.nextDouble();

        System.out.println("Patlıcan kaç kilo : ");
        p=değer.nextDouble();



        at =a*2.14;
        et=e*3.67;
        dt=d*1.10;
        mt=m*0.95;
        pt=p*5.00;
        tt=at+et+dt+mt+pt;


        System.out.println("Toplam Armut Tutarı : "+at);
        System.out.println("Toplam Elma Tutarı : "+ et);
        System.out.println("Toplam Domates Tutarı : " +dt);
        System.out.println("Toplam Muz Tutarı : "+mt);
        System.out.println("Toplam Patlıcan Tutarı : "+pt);

        System.out.println("Toplam tutar : "+ tt);
    }
}
