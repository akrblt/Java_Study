package day05_matematikselIslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {
        String str1="12345";
        String str2="23456";
        // verilen iki Stringin toplamini bulunuz
        // bu toplamayi yaparken Integer kullanilabilir. Non Primitiv olrak
        // Intefger.valueof(str1) metodu sadece sayisal ifadelerde kullanilir
        // Bir tane bile sayi disinda karakter olursa rte verir
        System.out.println(str1+str2);
        System.out.println(Integer.valueOf(str1)+Integer.valueOf(str2));
        int num=12;
        System.out.println(num-=3);


    }
}
