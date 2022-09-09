public class PalindromSayi {

    static boolean isPalindrom (int number ){
        int temp=number,lastNumber,reverseNumber=0;
        while (temp!=0){
            System.out.println("==========");
            System.out.println("Sayı :" +temp);

           lastNumber= temp %10;
            System.out.println("Son Basamak :" +lastNumber);

           reverseNumber =(reverseNumber*10) +lastNumber;
            System.out.println("Yeni Sayı :" +reverseNumber);

            temp /= 10;
            System.out.println("Yeni Temp :" +temp);

        }
        if (number ==reverseNumber){

            System.out.println( number +" " +"Bir Palindrom Sayıdır.");
            return  true;
        }else {
            System.out.println(number  +" " +"Bir Palindrom Sayı Değildir.");
            return false;
        }



    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(155));
    }
}
