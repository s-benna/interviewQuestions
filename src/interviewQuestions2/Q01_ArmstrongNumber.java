package interviewQuestions2;

import java.util.Scanner;

public class Q01_ArmstrongNumber {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

    public static void main(String[] args) {
        int sayi = 0;
        armstrongMu();
    }

    private static void armstrongMu(){ // parametreleri sildik cunku devamli dondurmesini istedik.
        Scanner input = new Scanner(System.in);

        System.out.println("3 basamakli sayi giriniz");
        int sayi = input.nextInt();
        if (sayi<0 || sayi>999 ){ //
            System.out.println("Yanlis deger girdiniz..");
            armstrongMu();
        }

        int sayiToplam = 0;
        int sayiKup = 0;
        int basamak = 0;

        for (int i = sayi; i > 0; i /= 10) { // sayiyi 10a bolerek 0a kadar azalt
            basamak = i %10;

            sayiKup =  (basamak*basamak*basamak);         // sayinin kupunu almak icin hazir metot yazdik
            sayiToplam += sayiKup;

        }
        if (sayi == sayiToplam){
            System.out.println(sayi+ " sayisi Amstrong sayidir.");
        }else {
            System.out.println(sayi+ " sayisi Amstrong sayi degildir.");
        }

    }

}


