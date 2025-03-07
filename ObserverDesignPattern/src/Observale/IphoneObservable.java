package Observale;

import Observer.NotificationxAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{

    //create a list who will choose the Iphone
    public List<NotificationxAlertObserver> list= new ArrayList<>();
    public int stockcount=0;


    @Override
    public void add(NotificationxAlertObserver observer) {
        list.add(observer);
    }


    @Override
    public void remove(NotificationxAlertObserver observer) {
        list.remove(observer);
    }




    @Override
    public void notifyallsubscriber() {
        for(NotificationxAlertObserver observer : list)
        {
            observer.update();
        }

    }

    @Override
    public void setStockcount() {

    }

    //if a store is adding stockadedd =10
    public void setStockcount(int newstockadded) {

        //if till now stockcount  was 0, then it will notofy to all subscriber
        if(stockcount==0)
        {
            notifyallsubscriber();
        }
        //then will increase the stockcount
        stockcount=stockcount+newstockadded;

    }

    public int getstockcount() {

        return stockcount;
    }
}
