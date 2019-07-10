package Simulator;

public class Simulator {
    private static Simulator ourInstance = new Simulator();

    public static Simulator getInstance() {
        return ourInstance;
    }

    private Simulator() {
    }
}
