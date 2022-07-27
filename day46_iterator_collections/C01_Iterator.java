package day46_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {
        List<Integer> liste=new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste);//[5, 7, 8, 6, 9]

        Iterator itr= liste.iterator();//iterator methodunu olusturdugumuz liste objesi
                                       // uzerinden ArrayList classindan calistiriyoruz

        /*
        iterator nasil calisir
        bir iterator obj si ols icin colection uyesi bir obj kullanmaliyiz
        yani biz bu iterator objsini bizim orn de liste objsi uzerinden olusturmus olduk
        Biz iterator obj si olusturdugumuzda ilk yere gider bekler
        [(itr)5, 7, 8, 6, 9]
        itr.hasnext()===>iteratore yaninda eleman var mi diye sorar true veya false dondurur
        itr.next()===>bir sonraki elementin yanina gecer uzerinden gectigi elementi dondurur
        itr.remove(); iteratorun elindeki elementi siler.2 defa ust uste remove kullanilamaz
         */

        System.out.println(itr.hasNext());//true
        System.out.println(itr.next());//5
        System.out.println(itr.next());//7
        itr.remove();// iteratorun elinde 7 vardi onu sildi  [5, 8, 6, 9]
        System.out.println(liste);//[5, 8, 6, 9]
    }
}
