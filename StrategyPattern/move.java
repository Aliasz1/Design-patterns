package StrategyPattern;

public class Move implements HumanInterface{
    public Human walk(Human user,int x, int z){
        user.x += x;
        user.z += z;
        System.out.println("New Position: " + user.x + " , " + user.y + " , " + user.z);
        return user;
    }

    public Human jump(Human user, int y){
        user.y += y;
        System.out.println("New Position: " + user.x + " , " + user.y + " , " + user.z);
        return user;
    }
}