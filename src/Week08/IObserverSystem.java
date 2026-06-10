package Week08;

public interface IObserverSystem {

     boolean add(IObserver iObserver);

    boolean remove(IObserver iObserver);

    boolean update(News news);

}
