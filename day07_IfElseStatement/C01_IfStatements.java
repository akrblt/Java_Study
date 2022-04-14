package day07_IfElseStatement;

public class C01_IfStatements {
    public static void main(String[] args) {
        int a=2;
        int b=3;

        if (a>b) {
            System.out.println(a+b);
            // Bagimsiz If cumleleri kendinden baska kodlarla ilgilenmez
            //Bir sart ve o sarta bagli sonuca odaklidir
            //Birden fazla bagimsiz if cumlesi old hepsi calsabildigi gibi
            // hicbiride calismayabilir

        }
        if (a!=b) {
            System.out.println("Verilen sayilar esit degil");

        }
        if (a>100) {
            System.out.println("A 10 den buyuk");

        }
        if (a*b>5) {
            System.out.println("Sayilarin carpimi 5 den buyuk");

        }

    }
}
