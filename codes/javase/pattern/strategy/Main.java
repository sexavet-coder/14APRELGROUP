package strategy;

public class Main {

    public static void main(String[] args) {

        Character character = new Character();

        character.setRunStrategy(new FastRun());

        character.performRun();
        
        character.setRunStrategy(new SlowRun());

        character.performRun();
    }
}