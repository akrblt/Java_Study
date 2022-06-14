package day27_constructor;

public class Cons02 {
    public static void main(String[] args) {

        Cons01 obj1 = new Cons01();// default constructor devrede
        // Cons01 classinda Hic constructor olusturmazsak java default constructor i kullandigindan
        // obj1 i uretebildik

        // Ancak biz parametreli veya parametresiz bir constructor yazdigimizda Java default
        // constructori siler.

        // Dolayisiyla biz herhangi bir constructor lusturdugumuzda daha once baska classlar
        // veya kullanicilarin olusturmus olabilecegi objeleri kullanabilmeleri icin
        // default constructorin islevini gerceklestirecek parametresiz bir constructor olusturmakta fayda var

        Cons01 obj2=new Cons01("Java");
    }
}
