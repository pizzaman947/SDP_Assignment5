public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee.getCoffee();
        System.out.print(". Total Price: ");
        System.out.print(coffee.getCost());
        System.out.println();
        coffee = new SugarDecorator(coffee);
        coffee.getCoffee();
        System.out.print(". Total price: ");
        System.out.print(coffee.getCost());
        System.out.println();
        coffee = new MilkDecorator(coffee);
        coffee.getCoffee();
        System.out.print(". Total price: ");
        System.out.print(coffee.getCost());
        System.out.println();




    }
}
