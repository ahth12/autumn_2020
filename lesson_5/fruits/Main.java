package lesson_5.fruits;

import lesson_5.fruits.Containers.Basket;
import lesson_5.fruits.Containers.Plastique;
import lesson_5.fruits.Food.Fruit;

public class Main {
    public static void main(String[] args) {
        Fruit apple = new Fruit("Яблоко",50, 0.15);
        Plastique plastique = new Plastique();
        Basket basket1 = new Basket();
        Human Anthony = new Human("Anthony");
        for (int i = 0; i < 20 ; i++) {
            basket1.pushFruit(apple);
        }
        for (int i = 0; i < 5 ; i++) {
            plastique.pushFruit(apple);
        }
        System.out.println(plastique);
        Anthony.eat(basket1.popFruit());

    }
}
