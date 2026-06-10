package Week08.Observer.Agency;

public class NewsAgency {

    private ObserverSystem observerSystem;

    public NewsAgency(ObserverSystem observerSystem) {
        this.observerSystem = observerSystem;
    }

    public NewsAgency() {
    }

    public void pushAll(News news){
        observerSystem.update(news);
    }
}
