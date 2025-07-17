package Lessons;

public class Dog extends Animal {
    private static int count = 0;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int length) {
        if (length > 500 || length < 0) {
            System.out.println(name + " не может пробежать больше 500 м. или отрицательную дистанцию");
        }
        else {
            super.run(length);
        }
    }

    @Override
    public void swim(int length) {
        if (length > 10 || length < 0) {
            System.out.println(name + " не может проплыть больше 10 м. или отрицательную дистанцию");
        }
        else {
            super.swim(length);
        }
    }

    public static int getCount() {
        return count;
    }
}
