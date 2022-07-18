package day40_overriding_pollymorphyism;

public class C04_Exeptions {
    public static void main(String[] args) {
        //String olarak verilen bir sayiyi, integer`a cevirip
        // 2 katini ekrana yazdiralim

        String str = "12345a";
        // str icinde sayi olmayan bir karakter olursa
        //NumberFormatException verir.




        try {
            int sayi = Integer.parseInt(str);
            System.out.println("Girilen sayinin 2 kati: " + (2 * sayi));
        } catch (Exception e) {
          //  e.printStackTrace();
            System.out.println("Girdiginiz string sayi olmayan elemetler iceriyor");
        }

    }
}
