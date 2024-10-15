public class Watches implements Observer{

    @Override
    public void update(Number temp) {
        System.out.println("The temperature is "+ temp);
    }
}
