package Week08.Observer.Agency;

public interface IObserverSystem {

     boolean add(IObserver iObserver);

    boolean remove(IObserver iObserver);

    boolean update(News news);

}
