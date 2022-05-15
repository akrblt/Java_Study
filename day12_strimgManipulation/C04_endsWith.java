package day12_strimgManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        // bu method ne ile bittigini kontrol eder. True yada False dondurur


        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String mail=scan.nextLine();
        if(!mail.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if(mail.endsWith("@gmail.com")){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontol edin yazdirin");
        }

    }
}
