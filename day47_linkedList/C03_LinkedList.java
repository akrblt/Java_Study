package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {

        Deque<Integer> ll1=new LinkedList<>();
       // System.out.println(ll1.element());// bosken l.NoSuchElementException firlatiyor
        System.out.println(ll1.peek());// bosken null dondurur
        System.out.println(ll1.poll());
        System.out.println(ll1.pollFirst());

        //ll1.pop();// ilk elementi silip bize dondurur
        // ilk elementi bulamazsa exception firlatir
        ll1.push(30);
        ll1.push(20);
        System.out.println(ll1);//[20, 30]

        System.out.println(ll1.remove());// ilk elementi siler ve bize dondurur 20
        System.out.println(ll1);//[30]
        ll1.push(45);
        ll1.push(45);
        ll1.push(30);
        System.out.println(ll1);//[30, 45, 45, 30]
        ll1.removeFirstOccurrence(30);
        System.out.println(ll1);//[45, 45, 30]

    }
}
