//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee customer1 = coffeeFactory.requestCoffee("capucinno");
        customer1.gotCoffee();
        Coffee customer2 = coffeeFactory.requestCoffee("espresso");
        customer2.gotCoffee();

        }
    }
