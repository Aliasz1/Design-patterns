package StrategyPattern;

public class Move implements HumanInterface{
    public Human walk(Human user,int x, int y, int z){
        user.x += x;
        user.y += y;
        user.z += z;
        System.out.println("New Position: " + user.x + " , " + user.y + " , " + user.z);
        return user;
    }
}