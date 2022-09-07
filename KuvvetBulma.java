import java.util.Scanner;

public class KuvvetBulma {
    public static void main(String[] args) {
        //Girilen Sayıya kadar 2,4ve 5in kuvvetlerini bulduran program
        Scanner inp =new Scanner(System.in);
        int n;
        System.out.println("Sayı Giriniz :");
        n =inp.nextInt();

        for (int i =1;i<n;i*=2){
            System.out.println(i);
        }

        System.out.println("-------------------------");

        for (int i=1;i<n;i*=4){
            System.out.println(i);
        }

        System.out.println("-----------------------------");
        for (int i=1;i<n;i*=5){
            System.out.println(i);
        }
    }
}
