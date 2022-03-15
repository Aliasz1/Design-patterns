package StrategyPattern;
public class Start{
    public static void main(String[] args){

        Human user = new Human();
        Context context = new Context(new HumanInterface(user,1,2,3));
    }
}