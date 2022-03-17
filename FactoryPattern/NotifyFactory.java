package FactoryPattern;

import org.omg.PortableInterceptor.NON_EXISTENT;

public class NotifyFactory {
    public NotifInterface NotifInt(String NotifType){

        //checks if the notification type is an Alert or Message
        //if type is others then it returns null
        if(NotifType == "Alert"){
            return new Alert();
        }
        else if(NotifType == "Message"){
            return new Message();
        }
        return null;
    }

}
