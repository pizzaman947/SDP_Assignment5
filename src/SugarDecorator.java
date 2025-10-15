public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public void getCoffee(){
        System.out.println("Coffee with sugar");
    }
    @Override
    public void getCost(){
        System.out.println("8.0 euro");
    }
}
