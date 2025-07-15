package Lessons;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(checkingAmountInInterval(10, 14));
        numberCheck(0);
        numberCheck2(1);
        printStringNumberTimes("hi", 3);
        leapYear(100);
        replacingNumbersInArray();
        fillingArray();
        replacementSomeElementsArray();
        fillingTwoDimensionalArray();
        System.out.println(Arrays.toString(createArray(4, 6)));

        Product product = new Product("cookie", "10.07.2025", "Sweet cookie", "Russia", 200, true);
        product.printProduct();

        Product[] productArray = new Product[5];
        productArray[0] = new Product("apple","15.05.2025","Green apple","Russia",50, false);
        productArray[1] = new Product("laptop","13.08.2023","Lenovo","China",50000, true);
        productArray[2] = new Product("t-shirt","10.04.2025","Zara","Bangladesh",1500, false);
        productArray[3] = new Product("shampoo","25.02.2025","Schwarzkopf","Germany",500, false);
        productArray[4] = new Product("book","29.11.2024","Favorite books","Russia",800, true);

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

    public static boolean checkingAmountInInterval(int a, int b) {
        return a + b >= 10 && a + b <= 20;
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