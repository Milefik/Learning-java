package Lessons;

public class Animal {
    protected String name;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int length) {
        System.out.println(name + " пробежал(а) " + length + " м.");
    }

    public void swim(int length) {
        System.out.println(name + " проплыл(а) " + length + " м.");
    }

    public static int getCount() {
        return count;
    }
}

