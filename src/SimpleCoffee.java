public class SimpleCoffee implements Coffee{
    @Override
    public void getCoffee(){
        System.out.println("Simple Coffee");
    }
    @Override
    public void getCost(){
        System.out.println("5.0 euro");
    }
}
