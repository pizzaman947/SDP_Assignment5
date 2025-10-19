public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public String getCoffee(){
        decoratedCoffee.getCoffee();
        return(decoratedCoffee.getCoffee()+" + Milk");
    }

    @Override
    public double getCost() {
       return decoratedCoffee.getCost()+1.0;

    }
}
