import java.util.Scanner;

public class KombinasyonHesap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,r,comb,totalnr=1,fark,totaln=1,totalr=1;
        System.out.println("N sayısını giriniz :");
        n=input.nextInt();

        System.out.println("R sayısını giriniz :");
        r=input.nextInt();

        if (n<r){
            System.out.println("R sayısı N sayısından büyük olamaz");
        }

        for (int i=1;i<=n;i++){
            totaln=totaln*i;
        }

        for (int c=1;c<r;c++){
            totalr =totalr*c;
        }
        fark =n-r;

        for (int b=1;b<fark;b++){
            totalnr=totalnr*b;
        }

        comb=(totaln/(totalr*totalnr));

        System.out.println("C(n,r) :" + comb);
    }
}
