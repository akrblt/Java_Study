package day27_constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        //Her obje olusturdugumuzda model,yakit gibi degerleri tek tek atama
        //yapmak istemiyorsaniz

        Volvo arab1=new Volvo("XC60",false,2023,"Benzin");

        System.out.println(arab1.toString());//Model : XC60 Yakit:  Benzin Max hiz: 240

        Volvo arab2=new Volvo("XC90",true,2021,"Elektrikli");
        System.out.println(arab2);
    }
}
