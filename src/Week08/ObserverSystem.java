package Week08;

import java.util.ArrayList;
import java.util.List;

public class ObserverSystem implements IObserverSystem{

    List<IObserver> observers;

    public ObserverSystem() {
        observers= new ArrayList<>();
    }

    @Override
    public boolean add(IObserver iObserver) {

        if(!observers.contains(iObserver)) {
            observers.add(iObserver);
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(IObserver iObserver) {
        if(observers.contains(iObserver)) {
            observers.remove(iObserver);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(News news) {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).push(news);
        }

        return false;
    }
}
