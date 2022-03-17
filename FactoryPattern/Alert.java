package FactoryPattern;

public class Alert implements NotifInterface{

    //prints Alert when notifyUser is called
    @Override
    public void notifyUser() {
        System.out.println("Alert!");
    }
}
