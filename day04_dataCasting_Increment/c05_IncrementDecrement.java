package day04_dataCasting_Increment;

public class c05_IncrementDecrement {
    public static void main(String[] args) {
        int sayi=20;
        System.out.println(sayi+10);// sayinin 10 fazlasini yazdirdik
        System.out.println(sayi);
        // eger atama yapmazsak artirma yada azaltma kalici olmaz
        sayi=sayi+10;
        System.out.println(sayi);
        System.out.println(sayi=sayi+=10);
        System.out.println(sayi++);
        System.out.println(sayi);
        System.out.println(++sayi);
        System.out.println(sayi);
        System.out.println(--sayi);
        System.out.println(sayi);


    }
}
