package day51_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanilanHarfSayisiniBulma {
    public static void main(String[] args) {
        /*
        soru1: verilen bir String`deki harfleri
        ve harflerin kacar kez kullanildigini return eden bir method yaxiniz
        ornek: Input : Hellooo output: H:1, e:1, L:2, o:3
         */

        String input="Hellooo";
        String harflerArr[]=input.split("");

        Map<String,Integer> kullanimSayilari=new HashMap<>();
        for (String each:harflerArr
             ) {
            if(kullanimSayilari.containsKey(each)){
                kullanimSayilari.put(each,kullanimSayilari.get(each)+1);
            }else {
                kullanimSayilari.put(each,1);
            }

        }
        System.out.println(kullanimSayilari);//{e=1, H=1, l=2, o=3}


        }
    }

