package Observer;

import Observale.StockObservable;

public class MobileNotifAlertObserver implements NotificationxAlertObserver{

    String username;
    StockObservable observer;

    public MobileNotifAlertObserver(String username, StockObservable observer) {
        this.observer=observer;
        this.username = username;
    }

    @Override
    public void update() {
        System.out.println("product is in stick");


    }
}
