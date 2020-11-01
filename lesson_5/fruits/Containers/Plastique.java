package lesson_5.fruits.Containers;

import lesson_5.fruits.Food.Fruit;

import java.util.Arrays;

public class Plastique extends Container {
    private static final double MAX_MASS = 1.0;
    private static final int MAX_NUMS = 5;
    private Fruit[] fruits = {};

    public void pushFruit(Fruit fruit){
        if (this.massRemain() - fruit.getWeight() >= 0
                && this.numsRemain() - 1 >= 0){
            this.fruits = Container.concatFruits(fruit, this.fruits);}
        else{System.out.println("В коробку не поместится больше фруктов");}
    }

    public Fruit popFruit(){
        if (fruits.length == 0){
            System.out.println("Фруктов больше нет");
            return null;}
        Fruit result =  this.fruits[fruits.length-1];
        this.fruits = Arrays.copyOfRange(this.fruits, 0, this.fruits.length-1);
        return result;
    }


    @Override
    public int numsRemain() {
        return MAX_NUMS - this.fruits.length;
    }

    @Override
    public double massRemain() {
        return MAX_MASS - Container.getFruitsMass(this.fruits);
    }

    @Override
    public String toString() {
        return "lesson_5.fruits.Containers.Plastique{" +
                "fruits=" + Arrays.toString(fruits) +
                '}';
    }

    public Fruit[] getFruits() {
        return fruits;
    }
}
