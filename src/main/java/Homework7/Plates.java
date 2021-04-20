package Homework7;

public class Plates {
    private int food;
    private int almostEmpty;


    public Plates(int food, int almostEmpty) {
        this.food = food;
        this.almostEmpty = almostEmpty;
    }

    public boolean decreaseFood(int n) {
        if (food >=n) {
            food -= n;
            return true;
        } else {
            return false;
        }
    }

    public void increaseFood(int m){
        food += m;
    }

    public boolean needRefill(){
        return food <= almostEmpty;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
