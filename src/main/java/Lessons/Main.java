package Lessons;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkingAmountInInterval(10, 14);
        numberCheck(0);
        numberCheck2(1);
        printStringNumberTimes("hi", 3);
        leapYear(100);
        replacingNumbersInArray();
        fillingArray();
        replacementSomeElementsArray();
        fillingTwoDimensionalArray();
        System.out.println(Arrays.toString(createArray(4, 6)));

        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(30);
        dogBobik.swim(12);

        Cat catBarsik = new Cat("Барсик");
        catBarsik.run(-8);
        catBarsik.swim(2);

        System.out.println("Кол-во животных: " + Animal.getCount());
        System.out.println("Кол-во котов: " + Cat.getCount());
        System.out.println("Кол-во собак: " + Dog.getCount());

        Bowl bowl = new Bowl(50);

        Cat[] cats = new Cat[3];
        cats[0] = catBarsik;
        cats[1] = new Cat("Муся");
        cats[2] = new Cat("Биба");

        for (Cat cat : cats) {
            System.out.println(cat.name + " сытость = " + cat.eat(bowl, 20));
        }

        Shape[] shapes = {
                new Circle(3, "Желтый", "Зеленый"),
                new Rectangle(2, 5, "Зеленый", "Синий"),
                new Triangle(5,2,3, "Синий", "Желтый")
        };

        for (Shape shape : shapes) {
            System.out.println("[ Периметр: " + shape.getPerimeter() + ", площадь: " + shape.getSquare() + ", цвет фона: " + shape.getFillColor() + ", цвет границ: " + shape.getBorderColor() + " ]");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = -5;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 15;
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value <= 100) {
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 30;
        int b = 55;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    public static void checkingAmountInInterval(int a, int b) {
        System.out.println(a + b >= 10 && a + b <= 20);
    }

    public static void numberCheck(int number) {
        if (number < 0) {
            System.out.println("Число отрицательное");
        }
        else {
            System.out.println("Число положительное");
        }
    }

    public static void numberCheck2(int number) {
        System.out.println(number < 0);
    }

    public static void printStringNumberTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    public static void leapYear(int year) {
        System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
    }

    public static void replacingNumbersInArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillingArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void replacementSomeElementsArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillingTwoDimensionalArray() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == arr[i].length - 1) {
                    arr[i][j] = 1;
                }
                else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);

        return arr;
    }
}