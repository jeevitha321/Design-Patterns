import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private Number tempreature;
    private List<Observer> observers;

    WeatherStation(){
        this.observers= new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer obs:observers){
            obs.update(this.tempreature);
        }
    }

    public void updateTemperature(Number temp){
        this.tempreature = temp;
        notifyObservers();
    }
}
