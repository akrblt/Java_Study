package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {
        //List`den gelen ozellik ve methodlari biliyoruz.
        // Ondan dolati Deque den gelen methodlara bakalim

        Deque<Integer> ll1=new LinkedList<>();
        ll1.addFirst(10);// add methoduna gore daha hizlidir

        ll1.addLast(20);//
        System.out.println(ll1);//[10, 20]
        System.out.println(ll1.element());//10 ilk elementi silmeden bize dondurur
                                           // bulamazsa exception firlatir
        System.out.println(ll1);//[10, 20]
        System.out.println(ll1.getLast());//20 sondaki elementi getirir
        System.out.println(ll1.getFirst());// 10 ilk elementi getirir

        ll1.offer(30);
        System.out.println(ll1);//[10, 20, 30]
        ll1.offerLast(40);
        System.out.println(ll1);//[10, 20, 30, 40]
        ll1.offerFirst(50);
        System.out.println(ll1);//[50, 10, 20, 30, 40]

        System.out.println(ll1.peek());// ilk elementi bsilmeden bize dondurur
                                       // bulamazsa null dondurur



    }
}
