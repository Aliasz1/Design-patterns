package StrategyPattern;

public class Start{
    public static void main(String[] args){

        //Creates a new Human
        Human user = new Human();

        //Create a context to use the interface
        Context context = new Context(new Move());

        //Human moves forward 1 space and right 3 spaces
        user = context.goMove(user, 1, 3);

        //Human jumps for 1 space and stays in the space
        user = context.goJump(user, 1);
        user = context.goMove(user, -1, 0);
    }
}