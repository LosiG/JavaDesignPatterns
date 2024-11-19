package streaming.factory_method;

public class Main {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        BananaFactory bananaFactory = new BananaFactory();

        Fruit apple = appleFactory.createFruit();
        Fruit banana = bananaFactory.createFruit();

        System.out.println("I'm able to create and eat fruit");
        apple.eat();
        banana.eat();

        System.out.println("\nAnd use that login in more complex method that were already implemented");
        appleFactory.doStuff();
        bananaFactory.doStuff();
    }
}