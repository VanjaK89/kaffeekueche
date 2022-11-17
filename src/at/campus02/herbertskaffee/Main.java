package at.campus02.herbertskaffee;

public class Main {
    public static void main(String[] args) {

        Coffee c = new Coffee();
        c.prepareRecipe();
        System.out.println("------------------");

        Tea t = new Tea();
        t.prepareRecipe();

        System.out.println("-----------------");

    }
}
