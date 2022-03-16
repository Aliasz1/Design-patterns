package StrategyPattern;
public class Context{
    private HumanInterface humanInterface;

    //Used to call the interface
    public Context(HumanInterface HInterface){
        humanInterface = HInterface;
    }

    //Main class will call these functions
    public Human goMove(Human user, int x, int z){
        return humanInterface.walk(user, x, z);
    }

    public Human goJump(Human user, int y){
        return humanInterface.jump(user, y);
    }
}