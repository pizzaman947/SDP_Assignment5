public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee.getCoffee();
        coffee.getCost();
        coffee = new SugarDecorator(coffee);
        coffee.getCoffee();
        coffee.getCost();
        coffee = new MilkDecorator(coffee);
        coffee.getCoffee();
        coffee.getCost();



    }
}
