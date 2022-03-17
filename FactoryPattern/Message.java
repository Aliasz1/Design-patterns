package FactoryPattern;

public class Message implements NotifInterface{

    //prints message when notifyUser is called
    @Override
    public void notifyUser() {
        System.out.println("Message.");
    }
}
