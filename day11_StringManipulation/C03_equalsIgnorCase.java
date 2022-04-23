package day11_StringManipulation;

import java.util.Scanner;

public class C03_equalsIgnorCase {
    public static void main(String[] args) {

        //kullaniciya derse katilip isteyip istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz alinmistir" yazdirin
        //hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Derse katilmak istermisiniz? \n Evet ise E hayir ise H yaziniz");
        String cevap=scan.next();

        if(cevap.equalsIgnoreCase("e")){
            System.out.println("cevabiniz :"+cevap+"  derse katiliminiz alinmistir");
        }else if(cevap.equalsIgnoreCase("h")){
            System.out.println("cevabiniz :"+cevap+"  Sonraki derslerimize bekleriz");
        }else {
            System.out.println("Lutfen E veya H yaziniz");
        }






    }
}
