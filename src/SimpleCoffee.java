public class SimpleCoffee implements Coffee{
    @Override
    public String getCoffee(){
        return("You have a Coffee");
    }
    @Override
    public double getCost(){
        return 5.0;
    }
}
