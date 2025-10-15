public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public void getCoffee(){
        decoratedCoffee.getCoffee();
        System.out.print(" + Milk");
    }

    @Override
    public double getCost() {
       return decoratedCoffee.getCost()+1.0;

    }
}
