package day34_accessMofifier_encapsulation;

public class C04_Encapsulation {
    public static void main(String[] args) {

        /*
        Bir variable`i encapsule etmek icin
        1- Access modifier`i private yapariz
        2- okuma ve yazma ozelliklerini kullanilmasini istedigimiz gibi sinirlayabiliriz
           -Eger sadece okunmasini istiyorsaniz getter
           -Sadece deger girilebilsin setter
           methodlarini olustururuz.

       Bir variable icin hem getter hem setter olusturursaniz
        o variable public olmus gibi hem okuyup hem de yazilmasini saglayabilirsiniz

        Piyasada developer`lar arasinda genel uygulama da boyledir.
         */
        C03 obj=new C03();

        System.out.println(obj.getSayi());//0

        obj.setStr("Java Java Java");
        System.out.println(obj.getStr());//Java Java Java

        System.out.println(obj);//C03{sayi=0, str='Java Java Java'}


    }
}
