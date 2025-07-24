package LessonOne;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {
                {"2", "1", "0", "hi"},
                {"1", "1", "0", "0"},
                {"1", "1", "0", "0"},
                {"1", "1", "0", "0"},
        };

        try {
            System.out.println("Сумма всех элементов массива: " + ArrayChecker.checkArray(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(arr[0][5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}