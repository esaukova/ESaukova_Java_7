package Homework7;

public class Cats {
    private String name;
    private int appetite;
    boolean fullness;

    public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = appetite == 0;
    }

    public boolean eat(Plates p) {
        fullness = p.decreaseFood(appetite);
        return fullness;
    }

    public boolean catIsFull() {
        return fullness;
    }

    public void info() {
    }

    public String getName() {
        return name;
    }
}
