package FactoryPattern;

public class Notifier{
    public static void main(String[] args) {
        //construct new factory
        NotifyFactory notifyFactory = new NotifyFactory();

        //construct new notification with alert notification
        NotifInterface notification = notifyFactory.NotifInt("Alert");
        notification.notifyUser();

        //changes the notification to message
        notification = notifyFactory.NotifInt("Message");
        notification.notifyUser();
    }

}
