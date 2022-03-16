package StrategyPattern;

public class Start{
    public static void main(String[] args){

        Human user = new Human();
        Context context = new Context(new Move());
        user = context.goMove(user, 1, 2, 3);
        user = context.goMove(user, 10, 22, 35);
        user = context.goMove(user, -1, -30, 0);
    }
}