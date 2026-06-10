package Week08.Observer.Agency;

public class Main
{

    static void main() {

        ObserverSystem observerSystem= new ObserverSystem();
        NewsAgency newsAgency = new NewsAgency(observerSystem);
        EmailService emailService = new EmailService();
        SmsService smsService = new SmsService();
        WebService webService = new WebService();

        observerSystem.add(smsService);
        observerSystem.add(emailService);
        observerSystem.add(webService);



        News news1 = new News();
        observerSystem.update(news1);

        newsAgency.pushAll(news1);


    }
}
