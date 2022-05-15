package day12_strimgManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        // contains metodu true yada false doner
        //Soru 1) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz");
        String mail=scan.nextLine();
        if(!mail.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        } else if(mail.lastIndexOf("@gmail.com")==(mail.length()-10)){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontol edin");
        }


    }
}
