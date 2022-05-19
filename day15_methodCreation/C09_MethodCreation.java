package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {

        String isim="yasmin arada";
        String soyisim="TArakCI";
        String kkNo="1234567891234234";

        //eger bir method tan bir islem yapmasini ve yaptigi islemi
        // bize getirmesini istersek
        // return type void degil, bize getirecegi sonucun data turunde olmalidir

       String gizlenmisIsimSoyisim= isimSoyisimGizle(isim,soyisim);
        // bize isim ve soyismin gizlenmis halini getirmesini istiyorum
        // bekledigim donus String olur
        // donus olunca o datayi almam gerekir. Bunun icinde hangi data turundeyse ona gore bir variable atariz.
        System.out.println(gizlenmisIsimSoyisim);

        // Yukarida anlatilan seyleri krediKartiGizle icinde yapiyoruz.
       String gizlenmisKKno= krediKartiGizle(kkNo);
        System.out.println(gizlenmisKKno);




    }

    public static String krediKartiGizle(String kkNo) {
        String yeniKKNo="**** **** **** "+kkNo.substring(12);// kk nin 16 haneli old biliyoruz
        return yeniKKNo;

    }

    // buradaki void i String yapariz
    public static String isimSoyisimGizle(String isim, String soyisim) {
        String yeniIsim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\S","*");

        // method olusturmada 3. adim
        // method calisinca sadece birsey mi yazdiracak
        // yoksa bize bir data mi dondurecek buna karar vermektir
        // Bu soruda gizlenmis isim soyisim dondurmesinii istediginden
        // return type i void degil String sectik
        // ve metodun sonuna return edilecek datayi yazdik
        return yeniIsim+" "+yeniSoyisim;
    }
}
