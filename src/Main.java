public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getCoffee());
        System.out.println(". Total price: "+coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getCoffee());
        System.out.println(". Total price: "+coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getCoffee());
        System.out.println(". Total price: "+coffee.getCost());






    }
}
