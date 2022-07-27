package day46_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArttirma {
    public static void main(String[] args) {
        // verilen listedeki her elementi 3 arttir

        List<Integer> liste=new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);//[5, 7, 8, 6, 9]

        // listenin tum elementlerini bize getirmesi icin iteratorun hasnext() ve next() met birlikte kullanacagiz

      //  Iterator itr= liste.iterator();
        ListIterator itr2= liste.listIterator();
        while (itr2.hasNext()){// yaninda element old surece calisir
           Object sayi=itr2.next();
           itr2.set((Integer)sayi+3);

        }
        System.out.println(liste);//[8, 10, 11, 9, 12]
    }
}
