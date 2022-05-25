package day19_doWhileLoop;

public class C05_Scope {


    static String kurs="Java";
    int level=10;


    public static void main(String[] args) {
        //1- Bir method icerisinde olus variable lar sadece olusturulduklari method da kullaniolabilir
        //Baska methodlarda kullanilamazlar
        //2- Tum methodlarin kullanabilmesini istedigimiz variable lari
        //  Class Level`da olustururuz.
        // Class level de olusturdugumuz variable i --static yaparsak tum methodlar kullanabilir.
        // -- static olmazsa (instance) o zaman sadece sattic olmayan methodlar kullanabilir.



        int sayi=10;

        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            int loopSayi=20;

        }
       // System.out.println(i); i yi sadece loop un icinsw gorur
        // int loopsayi=20; loop icinde olusturulan variable loop disinda kullanilamaz



    }
    public static void method1(){
        kurs=kurs;// static i static de kullanabiliriz

    }
    public void method2(){
        level=level; // static olmayani static olmayanda kullanabiliriz
        kurs=kurs;// static static olmayandada calisir

    }
}
