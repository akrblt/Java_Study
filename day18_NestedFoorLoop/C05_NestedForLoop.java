package day18_NestedFoorLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {
          /*
       A
       A B
       A B C
       A B C D
       A B C D E
       A B C D E F
       şeklini yazdırınız.  65=A'nın ascıı değeri
       */

        char harf='A';
        char sonHarf='H';

        for (char i = 'A'; i <=sonHarf; i++) {
            for (char j = 'A'; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");

        }

    }
}
