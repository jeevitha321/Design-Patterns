public class CoffeeFactory {
    public Coffee requestCoffee(String typeOfCoffee){
     Coffee coffeeNtAvailable = ()->{
           System.out.println("Sorry! The requested coffee s not available");
         };
        return switch (typeOfCoffee) {
            case "capucinno" -> new Cappucino();
            case "latte" -> new Latte();
            default -> coffeeNtAvailable;
        };
    }
}
