package day39_overriding;

public class Araba {

  protected   String hareket="Arabalar Teker ile hareket eder.";
    protected String hiz="Arabalar motor gucune gore hiz yaparlar.";
    protected String yakit="Arabalar farkli yakitlar kullanabilirler";
    protected String marka="Arabalar uretildikleri markaya sahiptir.";

    public void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanabilir");
    }
    public void yakitTuketimi(){
        System.out.println("Arabalar motor gucu ve yakit turune gore yakit tuketirler");
    }


}
