package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        // LinkedListin 2 tane parent interface i vardir.
        // Bunu olusturuken data turu olarak
        // LinkledList secersek : 2 parent daki methodlar
        // List secersek: sadece list deki methodlar
        // Deque/Queue secersek :Deque deki methodlari kullanabiliriz
        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(10);// LinkedList


        //Sadece List interface inden ozellikler kullanmak istersek

        List<Integer> ll2=new LinkedList<>();
        ll2.add(10);
        ll2.remove(0);

        // sadece Deque den gelen ozellilkeri kullanalim derseek

        Deque<Integer> ll3=new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3);//[15, 20]
        ll3.addLast(40);//[15, 20,40]
    }
}
