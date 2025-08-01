package LessonOne;

public class CalculateFactorial {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должна быть >= 0");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
