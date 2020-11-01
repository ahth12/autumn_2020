package lesson_5.fruits.Containers;

import lesson_5.fruits.Food.Fruit;

abstract public class Container {
    protected double MAX_MASS;
    protected int MAX_NUMS;
    protected Fruit[] fruits;
    abstract protected  int numsRemain(); //возвращает количество оставшегося места
    abstract protected  double massRemain(); //возвращает количество оставшегося веса
    abstract protected void pushFruit(Fruit fruit); //проталкивает фрукт
    abstract protected Fruit popFruit(); //вытаскивает фрукт

    //вычисляет массу всех фруктов
    public static double getFruitsMass(Fruit ...fruits){
        double mass = 0;
        for (int i = 0; i < fruits.length ; i++)
        {
            mass += fruits[i].getWeight();
        }
        return mass;
    }
//объединяет старый массив фруктов с новым фруктом
    public static Fruit[] concatFruits(Fruit f1, Fruit[] fruitsDown){
        Fruit[] result = new Fruit[1 + fruitsDown.length];
        result[0] = f1;
        for (int i = 1; i < result.length; i++) {
            result[i] = fruitsDown[i-1];
        }
        return result;
    }
}
