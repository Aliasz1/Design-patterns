package StrategyPattern;
public class Context{
    private HumanInterface humanInterface;

    public Context(HumanInterface HInterface){
        humanInterface = HInterface;
    }

    public Human goMove(Human user, int x, int y, int z){
        return humanInterface.walk(user, x, y, z);
        
    }
}