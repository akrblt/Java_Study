package day30_passByValue;

public class C03_PassByValue {


    public static void main(String[] args) {
        /*
        Java pass by value bir programlama dilidir
        Yani bir primitive variable`i argument olarak bir method`a yollarsaniz
        Java o variable`i degil, degerini(value) method`a yollar(pass)
         */
        double etiketFiyat=100;

        yuzdeOnIndirimYap(etiketFiyat);
        yuzdeOnIndirimYap(etiketFiyat);
        System.out.println("iki indirimden sonra main method`da etiket fiyati:  "+etiketFiyat);//  100.0
    }

    public static void yuzdeOnIndirimYap(double etiketFiyat) { // buraya etiket Fiyati yazdigimiz zaman kodun okunurlulugunu arttiririz

        etiketFiyat=etiketFiyat*0.9;
        System.out.println("Sizin icin %10 indirimli fiyatimiz: "+etiketFiyat);//Sizin icin %10 indirimli fiyatimiz: 90.0
    }
}
