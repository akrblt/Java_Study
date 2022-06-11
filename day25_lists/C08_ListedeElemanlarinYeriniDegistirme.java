package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {
        // Verilen bir listede , istenen iki index deki elementlerin yerini
        // kalici olarak degistiren bir method olusturun

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex=2;
        int ikinciIndex=5;
        sayilar=swapElements(sayilar,ilkIndex,ikinciIndex);
        System.out.println("sayilar = " + sayilar);//[1, 3, 6, 3, 5, 5, 1, 7]
    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        // bir temp sayi olusturup
        // verilen indexlerdeki sayilari yer degistirin
        // indexleri kontrol edip sinirin otesinde index verildiyse uyari mesaji yazdirin

        int temp=0;
        if(ilkIndex<sayilar.size()-1&&ikinciIndex<sayilar.size()-1){
            temp=sayilar.get(ilkIndex);
            sayilar.set(ilkIndex,sayilar.get(ikinciIndex));
            sayilar.set(ikinciIndex,temp);
        }else {
            System.out.println("Yanlis index girdiniz");
        }






        return sayilar;
    }
}
