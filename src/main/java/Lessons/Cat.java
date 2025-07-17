package Lessons;

public class Cat extends Animal {
    private static int count = 0;
    private boolean satiety = false;

    public Cat(String name) {
        super(name);
        count++;
    }
    @Override
    public void run(int length) {
        if (length > 200 || length < 0) {
            System.out.println(name + " не может пробежать больше 200 м. или отрицательную дистанцию");
        }
        else {
            super.run(length);
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(name + " не умеет плавать ");
    }

    public static int getCount() {
        return count;
    }

    public boolean eat(Bowl bowl, int amount) {
        return satiety = bowl.decreaseCountEat(amount);
    }
}
