abstract class CoffeeDecorator implements Coffee{
   protected Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }
    @Override
    public abstract String getCoffee();
    @Override
    public abstract double getCost();
    }
