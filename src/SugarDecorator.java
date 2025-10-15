public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public void getCoffee(){
        decoratedCoffee.getCoffee();
        System.out.print(" + Sugar");
    }
    @Override
    public double getCost(){
        return decoratedCoffee.getCost() + 1.0;

    }
}
