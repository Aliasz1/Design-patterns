package StrategyPattern;

public class Start{
    public static void main(String[] args){

        Human user = new Human();
        Context context = new Context(new Move());
        user = context.goMove(user, 1, 3);
        user = context.goJump(user, 10);
        user = context.goMove(user, -1, 0);
    }
}