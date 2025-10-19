public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getCoffee(){
        decoratedCoffee.getCoffee();
        return(decoratedCoffee.getCoffee()+" + Sugar");
    }
    @Override
    public double getCost(){
        return decoratedCoffee.getCost() + 1.0;

    }
}
