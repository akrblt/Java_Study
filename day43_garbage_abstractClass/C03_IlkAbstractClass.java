package day43_garbage_abstractClass;

public abstract class C03_IlkAbstractClass {

    public abstract void AbstarctMethod();


    /*
    Abstract classlarin MUTLAKA override etmesi gereken methodlardir.
    Dolayisiyla HICBIR ZAMAN direk calistirilmazlar
     ve bu sebeple method body`sine ihtiyac yoktur.

     Bir class in veya methodun abstract olup olmadigini anlayabilirmiyiz?
     -abstract yaziyorsa abstractir,yazmiyorsa degildir
     (Abstract olmayan class`lara concrete class/method denir.)

     Abstract methodlar bodye sahip olamaz
     Concrete methodlar ise method body`si olmadan olusturulamaz
     */
}
