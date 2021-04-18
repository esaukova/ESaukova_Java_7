package Homework6;

public class Dogs extends Animals {

    public Dogs(String name) {
        super(name);
        runLimit = 500;
        swimLimit = 10;
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println("Dog " + getName() + "run " + distance + "m ");
        } else {
            System.out.println("Dog " + getName() + "has tired ");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= swimLimit) {
            System.out.println("Dog " + getName() + "swam " + distance + "m ");
        } else {
            System.out.println("Dog " + getName() + "has tired ");
        }
    }
}
