public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public void getCoffee(){
        System.out.println("Coffee with Milk");
    }

    @Override
    public void getCost() {
        System.out.println("10.0 euro");
    }
}
