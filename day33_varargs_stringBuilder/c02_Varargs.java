package day33_varargs_stringBuilder;

public class c02_Varargs {
    public static void main(String[] args) {
        // parametre olarak bir int
        // ve istedigimiz kadar String olan
        // en uzun kelimenin harf sayisi ile int parametre degerini
        // carpip sonucu yazdiran bir method olusturun
        
        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        
        carpim(sayi,str1,str2);
        // Bir methodda varargs disinda parametre kullanacaksak
        // once diger parametreleri yazip varargs`i en sona yazmaliyiz
        // Bu sebeble bir methodta birden fazla varargs olamaz
    }

    private static void carpim(int sayi, String... str) {
        String enUzunStr="";

        for (String each: str
        ) {
            if(each.length()>enUzunStr.length()){
                enUzunStr=each;
            }

        }
        System.out.println("Carpim: "+(enUzunStr.length()*sayi));
    }
}
