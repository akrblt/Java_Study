package day15_methodCreation;

public class C07_MethodCreation {
    public static void main(String[] args) {

        //String i yazdiran metod olusturalim
        //hosgeldiniz diyen bir metod olusturun
        // kapanma mesaji yazan bir metod olustur

        hosgeldinYazdir();


    }

    public static void kapanmaMesaji() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("Boyle de olur");
        // methodlarin icine diger metodlari cagirabiliriz
        //Java sirasiyla onlari calistirir.


    }

    public static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMesaji();
    }
}
