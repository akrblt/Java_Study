package day27_constructor;

public class VolvoRunner {
    public static void main(String[] args) {
        Volvo arab1=new Volvo();
        System.out.println(arab1.marka);//Volvo
        arab1.yakit="Dizel";
        arab1.elektrikliMi=false;
        System.out.println(arab1.maxHiz);//240

        System.out.println(arab1.toString());//Model : null Yakit:  Dizel Max hiz: 240

        Volvo arab2= new Volvo();
        arab2.yakit="Elektrikli";
        arab2.elektrikliMi=true;
        arab2.model="XC90";
        System.out.println(arab2.toString());//Model : XC90 Yakit:  Elektrikli Max hiz: 240
    }
}
