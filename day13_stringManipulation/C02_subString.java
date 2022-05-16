package day13_stringManipulation;

public class C02_subString {
    public static void main(String[] args) {
        // 1-48 of 104 results for "nutella"
        //Bu arama sonucundaki bulunan sonuc sayisi 100 den cok ise super
        // az ise "az sonuc bulundu"

        String str="1-48 of 10450 results for \"nutella\"";
        int ilkSpace=str.indexOf(" ");// 4
        int ikinciSpace=str.indexOf(" ",ilkSpace+1);
        int ucuncuSpace=str.indexOf(" ",ikinciSpace+1);

        String aramaSonucuSayisiStr=str.substring(ikinciSpace+1,ucuncuSpace);

        int aramaSonucSayisiInt=Integer.valueOf(aramaSonucuSayisiStr);
        if(aramaSonucSayisiInt>100){
            System.out.println("Super");
        }else {
            System.out.println("Az sonuc bulundu");

        }


    }
}
