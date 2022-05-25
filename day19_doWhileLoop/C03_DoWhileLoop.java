package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //kullanicidan poz bir tamsayi alip
        // while loop ile 5 ten kucuk pozitif tam  sayilari yazdiralim
        int input=1;

        int sati=1;

        while (sati<input){
            System.out.println(sati);

            sati++;
        }
      // Ayni soruyu Do While Loop ile yapalim
        sati=1;
        do {
            System.out.println(sati);

            sati++;

        }while (sati<input);

    }
}
