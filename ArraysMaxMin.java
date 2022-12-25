import java.util.Arrays;
import java.util.Scanner;

public class ArraysMaxMin {
    public static void main(String[] args) {
        int[]array={15,12,788,1,-1,-788,2,0};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int maxNum=0;
        int minNum=0;
        Arrays.sort(array);

        for (int i:array){
            if (i>num) {
                maxNum = i;
                break;
            }
        }

        int[]reverse=new int[array.length];
        for (int i=0,j=array.length-1;i<array.length;i++,j--) {
            reverse[i]=array[j];
        }
        for (int i: reverse){
            if (i<num){
                minNum=i;
                break;
            }
        }
        System.out.println();
        System.out.println("Girilen sayı: " + num);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + minNum);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + maxNum);
    }

}
