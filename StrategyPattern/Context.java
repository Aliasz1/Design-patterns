package StrategyPattern;
public class Context{
    private HumanInterface humanInterface;

    public Context(HumanInterface HInterface){
        humanInterface = HInterface;
    }

    public Human goMove(Human user, int x, int z){
        return humanInterface.walk(user, x, z);
    }

    public Human goJump(Human user, int y){
        return humanInterface.jump(user, y);
    }
}