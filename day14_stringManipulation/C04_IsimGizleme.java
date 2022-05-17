package day14_stringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {
        //oru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
        //        isim-soyisim : M***** B*******
        //        kart no : **** **** **** 1234

        String isim="yasmin arada";
        String soyisim="TArakCI";
        String kkNo="1234567891234234";

        String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");
        String yeniKKNo="**** **** **** "+kkNo.substring(12);// kk nin 16 haneli old biliyoruz
        System.out.println("isim-soyisim: "+yeniIsim+" "+yeniSoyisim+"\n " +
                "kart no: "+yeniKKNo);


    }
}
