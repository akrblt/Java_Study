package day26_forEachLoop_constructor;

public class Araba {

       /* Java da her Class olusturdugumuzda
       Java o class `dan objeler uretmek gerekecegini bilir
        ve biz belirtmesekde Java
        her olusturdugu class`a bir constructor koyar

          Javanin class olustururken class a koydugu constructor a
          DEFAULT CONSTRUCTOR denir ve bu constructor gorunmez

          Eger biz gorunur bir constructor `imiz olsun istersek
          default constructor ile ayni gorevi yapan bir constructor olusturabiliriz

         veya ayni kaliptan farkli desenlerde objeler olusturmak icin
         farkli ozelliklerde condtructorlar da olusturabiliriz

           Constructorlari birbrinden farklilastiran tek ayricalik kullanilan
           parametre sayisi ve parametre data turudur
        */
     public Araba(){
         System.out.println("parametresiz constructor calisti");

     }
     /* bir kod blogunun method veya constructor olmasindan emin olmak istiyorsaniz
      1- constructorlarin ismi class ismi ile ayni olmak zorundadir yani buyuk harfle baslar
      2- constructorlarin return type olmaz

        ozetle; constructorin adi class adi ile ayni olmali
                 return type olmamali
      */
    public Araba(String renk){
        System.out.println(renk+" renkli bir araba uretildi");
    }

    public Araba(int yil){
        System.out.println(yil+" model bir araba uretildi");
    }
    public Araba (int yil, String renk){
        System.out.println(yil+" model "+renk+" renkli bir araba uretildi");
    }

}
