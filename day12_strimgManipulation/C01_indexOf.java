package day12_strimgManipulation;

import java.util.Scanner;

public class C01_indexOf {
    public static void main(String[] args) {
       // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
      //  - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
       // - Girilen kelime cumlede 1’den fazla kullanilmis.

        Scanner scan=new Scanner(System.in);

        String cumle="Java ogren,yeni program ile yeni bir sayfa ac";
        String kelime="program";

        int ilkkulanim=cumle.indexOf(kelime);//-1 veya index
        int ikincikullanim=cumle.indexOf(kelime,ilkkulanim+1);
        if(ilkkulanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        }else if(ikincikullanim==(-1)){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        }else {
            System.out.println(" Girilen kelime cumlede 1’den fazla kullanilmis.");
        }


    }
}
