package day43_garbage_abstractClass;

public class C05_ChildOfAbstract extends C04{
    /*
    Bir abstract classin child classi olarak belirtmek istersek
    Java hemen class isminin altini kirmizi cizer
    bizden
    child classi abstract yapmamizi veya parent class`daki abstract methodlari
    override etmemizi ister

    Parent olan abstract classdaki concrete methodlar ise opsiyoneldir
    onlari istersek override ederiz, istemezsek override etmeyiz

     */
    @Override
    public void absMethod() {

    }
}
