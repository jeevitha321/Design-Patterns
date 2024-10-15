public class Main {
    public static void main(String[] args) {

        WeatherStation w1 = new WeatherStation();
        Watches watch1 = new Watches();
        Alarm alarmSystem = new Alarm();

        w1.registerObserver(watch1);
        w1.registerObserver(alarmSystem);

        w1.updateTemperature(50);
        w1.updateTemperature(20);
    }
}