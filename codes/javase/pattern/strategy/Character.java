package strategy;

public class Character {

    private RunStrategy runStrategy;

    public void setRunStrategy(RunStrategy runStrategy) {

        this.runStrategy = runStrategy;

    }

    public void performRun() {

        if (runStrategy != null) {

            runStrategy.run();

        } else {

            System.out.println("Run strategiyasi secilmeyib");

        }

    }

}