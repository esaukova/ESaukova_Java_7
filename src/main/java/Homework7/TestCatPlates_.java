package Homework7;

import java.util.Random;

public class TestCatPlates_ {
    public static void main(String[] args) {
        feedCats ();
        
    }

    private static void feedCats() {
        Random random = new Random();

        Cats[] cat = new Cats[5];
        cat[0] = new Cats("Barsik", 10);
        cat[1] = new Cats("Murzik", 20);
        cat[2] = new Cats("LuLu", 15);
        cat[3] = new Cats("Vaska", 5);
        cat[4] = new Cats("Ex", 50);

        Plates plate = new Plates(50, 10);

        for (Cats x:cat){
            checkPlates(random, plate);
            feedOneCat(plate, x);
        }

    }

    private static void feedOneCat(Plates plate, Cats x) {
        plate.info();
        x.info();
        if (x.catIsFull()) {
            System.out.println(x.getName() + " is full");
        } else {
            System.out.println(x.getName() + " is eating");
            if (x.eat(plate)) {
                System.out.println(x.getName() + " is finally full");
            } else {
                System.out.println(x.getName() + " is still hungry");
            }

            }
        }

    private static void checkPlates(Random random, Plates plate) {
        if (plate.needRefill()) {
            System.out.println("The plate is almost empty!");
            if (random.nextBoolean()){
                System.out.println("Put extra food");
                plate.increaseFood(random.nextInt(5) + 1);
            }
        }
    }

}
