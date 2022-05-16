package day13_stringManipulation;

public class C01_substring {
    public static void main(String[] args) {

        // index kullanarak verilen string in istenen parcasini almamizi saglar
        //

        String str="Java ile IT cok guzel";
        System.out.println(str.substring(5));// 5. index ten sonrasini yazdirir
        // Yukaridaki String i kullanarak Mehmet hoca ile IT cok guzel
        System.out.println(str.replace("Java","Mehmet hoca"));
        System.out.println("Mehmet hoca "+str.substring(5));
        System.out.println(str.substring(9));//IT cok guzel 9 inclusive yani dahil

        //Eger bir indexten sona kadar olan parcayi degil
        //Belirli araliktaki bir parcayi almak icin
        // Baslangic ve Bitis indexi yazilmalidir.
        //Baslangic indexi inclusive dir ama bitis indexi exclusive/haric

        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,1));
        System.out.println(str.substring(5,6));//6. harfi bulunuz

        str="Java gun gectikce guzellesiyor";
       System.out.println(str.substring(7,7));

       // System.out.println(str.substring(5,2));
        // buyuk index ten kucuk index e git dersek hata verir.
        System.out.println(str.substring(str.length()-1));// Son harfi verir
        System.out.println(str.substring(str.length()-5));// son bes karakter
        System.out.println(str.substring(str.length()));// son karakterden sonrasi yani "" hiclik verir





    }
}
