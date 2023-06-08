package interviewQuestions1;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız. 3'den fazla yanlis girislerde bloke koyunuz.

        public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String sifre = "ali1234.";
        int girisSayisi = 3;




            do {
                System.out.println("Sifrenizi giriniz..");
                String girisSifre = scan.nextLine();
                if (sifre.equals(girisSifre)) {
                    System.out.println("Giris basarili");
                    break;
                } else {
                    System.out.println("Yanlis giris yaptiniz..");
                    girisSayisi--;
                    System.out.println(girisSayisi + " hakkiniz kaldi..");

                }if (girisSayisi == 0) {
                    System.out.println("Kartiniz bloke olmustur.");
                    break;
                }
            }while (true);












     }//main
}//class
