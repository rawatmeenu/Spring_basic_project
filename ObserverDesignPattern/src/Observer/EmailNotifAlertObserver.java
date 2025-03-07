package Observer;

import Observale.StockObservable;

public class EmailNotifAlertObserver implements NotificationxAlertObserver{


    String emailId;
    StockObservable observable;
    public EmailNotifAlertObserver(String emailId, StockObservable observable) {
        this.emailId=emailId;
        this.observable=observable;
    }

    private void sendemail(String emailId, String msg){
        System.out.println("mail sent to" + emailId);
    }
    @Override
    public void update() {
        sendemail(emailId, "product is in stock");

    }
}
