package lesson_5.fruits.Food;

public class Fruit extends Food {
    private String name;
    private int calorie;
    private double weight = 0.001;

    public Fruit(String name, int calorie, double weight) {
        this.calorie = calorie;
        this.weight = weight;
        this.name = name;
    }

    public Fruit(String name, double weight) {
        this.weight = weight;
        this.name = name;
    }

    public Fruit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@Override
    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "lesson_5.fruits.Food.Fruit{" +
                "name='" + name + '\'' +
                ", calorie=" + calorie +
                ", weight=" + weight +
                '}' + "\n";
    }
}
