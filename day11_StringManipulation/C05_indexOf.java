package day11_StringManipulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {
        String str1="Java bir baska guzel valla cok guzel";
        System.out.println(str1.indexOf('J'));//0  ilk harfin indexi
        System.out.println(str1.indexOf('l'));//19  son harfin indexi
        System.out.println(str1.length()-1);//19 son harfin indexi
        System.out.println(str1.indexOf("aska"));//10
        System.out.println(str1.indexOf('b'));//5 ilk buldugu yerin indexini getirir

        System.out.println(str1.indexOf('b',5));// buraya yazdigimiz index dahil oluyor
                                                             //inclusive denir. Fromindex bu anlama gelir. Dahil demek
        System.out.println(str1.indexOf('b',6));//9. indexde 2. b yi bulur.

        //verilen Stringdeki 2.a harfinin indexini bulalim
        int ilkIndex=str1.indexOf('a');
        System.out.println(str1.indexOf('a',ilkIndex+1));
        System.out.println(str1.indexOf('b',str1.indexOf('b')+1));//2. b yi bulduk
        //19. indexten sonra guzel aratalim
        System.out.println(str1.indexOf("guzel",20));//31

        //String de olmayan bir harf aratsak
        System.out.println(str1.indexOf('y'));//-1  indexof bize int dondurdugu icin olmayani sayisal olarak -1 ile ifade eder
        // yok demenin sayisal karsiligi olarak java -1 i tercih etmis

        //kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String mail=scan.nextLine();
        if (mail.indexOf("@") == (-1)) {
            System.out.println("Gecersiz");

        }else {
            System.out.println("mailiniz kabul edildi");
        }


    }
}
