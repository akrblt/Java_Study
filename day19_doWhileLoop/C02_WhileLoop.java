package day19_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan 1 sayi alin ve rakamlari toplamini yazdirin

        int input=2;
        int rakam=0;
        int rakamlarToplami=0;

        while (input>0){
            rakam=input%10;
            rakamlarToplami+=rakam;
            input/=10;
        }
        System.out.println(rakamlarToplami);

    }
}
