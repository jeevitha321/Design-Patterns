public class Alarm implements Observer{

    @Override
    public void update(Number temp) {
        if(temp.intValue() > 30){
            System.out.println("The clock is triggering the alarm");
        }
        System.out.println("The temperature is " + temp);

    }
}
