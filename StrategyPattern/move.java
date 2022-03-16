package StrategyPattern;

public class Move implements HumanInterface{

    //Moves the Human on the X and Z axis
    public Human walk(Human user,int x, int z){
        user.x += x;
        user.z += z;
        System.out.println("New Position: " + user.x + " , " + user.y + " , " + user.z);
        return user;
    }

    //Moves the Human on the Y axis
    public Human jump(Human user, int y){
        user.y += y;
        System.out.println("New Position: " + user.x + " , " + user.y + " , " + user.z);
        return user;
    }
}