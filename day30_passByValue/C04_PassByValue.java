package day30_passByValue;

public class C04_PassByValue {
    // eger bir method da yapilan degisikligin kalici olmasini istiyorsak
    // Iki yontem kullanabiliriz.
    //1- Variable i class level da static olarak olusturabiliriz

    static  double etiketFiyati;
    static double indirimYuzdesi;

    public static void main(String[] args) {
        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();
        indirimYuzdesi=15;
        kaliciIndirimYap();
    }

    public static void kaliciIndirimYap(){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : "+etiketFiyati);
    }
}
