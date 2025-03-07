package Observer;

public interface NotificationxAlertObserver {

    //this will notify. this is an observer which is observing the stockobservable. if the product is in stock then it will send the alert via notification.
    public void update();
}
