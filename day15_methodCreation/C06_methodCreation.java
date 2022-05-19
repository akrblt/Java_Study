package day15_methodCreation;

public class C06_methodCreation {
    public static void main(String[] args) {

        int a=10;
        int b=20;
         // iki variable in degerlrini toplayan bir metod olusturalim
        //1.adim : Method adini yaz
        //2.adim: Metoda gondermem gereken arguman var mi?
        // metodun aadini yazip cagiriyoruz



        ikiSayiTopla(25,50);


         // Baska classlrada olusturdugumuz metodlarida cagirabiliriz.
         // Ayni yada baska classlarda olmasinin bir onemi yoktur.
        // Java geldigi satiri calistirir.
        C04.dortHarfiTersineCevir("sema");






    }
    //bir method u olusturmak calismasi icin yeterli degildir
    //method ancak cagrilirsa calisir

    private static void ikiSayiTopla(int a, int b) {
        System.out.println("Verilen iki sayini toplami: "+(a+b));
    }


}
