package day09_ternary_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        //Bazen Ternary deki 2 sonucun data turleri farkli olabilir.

        //Verilen sayi 100 den buyukse sayinin karesini alip yazdiran
        // 100 den kucukse "Sayi 100 den buyuk olmali" yazdiran Ternary yazdirin

        int sayi=50;
        // ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz
        // veya bir degiskene atamaliyiz
        //Eger sonuclar farkli data turunde ise
        // atama yapacaginiz variable in data turu tek olacagindan
        // atama yapamayiz
        // SADECE DIREK YAZDIRABILIRIZ
        System.out.println(sayi>100 ? sayi*sayi: "Sayi 100 den buyuk olmali");
    }
}
