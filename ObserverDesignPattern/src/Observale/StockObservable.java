package Observale;

import Observer.NotificationxAlertObserver;

public interface StockObservable {

    public void add (NotificationxAlertObserver observer);



    public void remove(NotificationxAlertObserver observer);



    public void  notifyallsubscriber();

    public void setStockcount(int newstockadded);

    public int getstockcount();

}
