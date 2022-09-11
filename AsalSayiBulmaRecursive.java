import java.util.Scanner;

public class AsalSayiBulmaRecursive {

    static void asal(int a){
    int sayaç=0;
    for (int i=2;i<=a;i++){
        if(a%i==0){
            sayaç++;
        }
    }
    if (sayaç==1){
        System.out.println("ASAL Sayı");
    }else {
        System.out.println("Asal Değil.");
    }
    }

    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int a=inp.nextInt();
        asal(a);
    }

    }

