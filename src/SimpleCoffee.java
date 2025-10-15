public class SimpleCoffee implements Coffee{
    @Override
    public void getCoffee(){
        System.out.print("Your coffee contain: Simple Coffee");
    }
    @Override
    public double getCost(){
        return 5.0;
    }
}
