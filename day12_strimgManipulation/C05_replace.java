package day12_strimgManipulation;

public class C05_replace {
    public static void main(String[] args) {
        // bu method ile mi basliyor anlamina gelir. True yada False dondurur
        //isEmpty bos mu degil mi onu sorar.True yada false dondurur
        // replace() metodu yerine koyma degistirme anlamina gelir.
        String str="Bugun ne cok sey ogrendik";
        // bu cumledeki space disindaki karakter sayisini bulunuz
        String bosluksuz=str.replace(" ","");
        System.out.println("Space siz karakter sayisi: "+bosluksuz.length());
        System.out.println("Str karakter sayisi: "+str.length());

        //str da kalici degisiklik yapalim.
        //bugun yerine yarin ogrendik yerine ogrenecegiz yazdiralim
        System.out.println(str);

        str=str.replace("Bugun","Yarin");
        str=str.replace("ogrendik","ogrenecegiz");
        System.out.println("Yeni str: "+str);
        str.replace("ne cok","ne az");
        System.out.println("Str son hali: "+str);



    }
}
