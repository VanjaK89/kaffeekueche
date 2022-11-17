package at.campus02.herbertskaffee;

public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected  abstract void addCondiments();

    protected void pourInCup() {
        System.out.println("giese in Häferl");
    }

    protected abstract void brew();


    protected void boilWater(){
        System.out.println("Koche Wasser");
    }
}
