package at.campus02.herbertskaffee;

public class Tea extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("Tea: Füge Zitronensaft hinzu");
    }

    @Override
    protected void brew() {
        System.out.println("Tea:  10 min stehen lassen");
    }
}
