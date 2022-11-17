package at.campus02.herbertskaffee;

public class Coffee extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("Coffee: Wir geben Milch und Zucker");
    }

    @Override
    protected void brew() {
        System.out.println("Coffee: Espresso auf kochen");
    }
}
