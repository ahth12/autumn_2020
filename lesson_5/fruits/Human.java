package lesson_5.fruits;

import lesson_5.fruits.Food.Food;

public class Human {
    private String name;
    public void eat(Food a){
            System.out.println(a.getCalorie() + " калорий съедено");
    }

    public Human(String name) {
        this.name = name;
    }
}
