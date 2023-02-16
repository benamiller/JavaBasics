public class Main {

    public static double getAverage(int[] array) {
        double runningSum = 0;
        for (int num : array) {
            runningSum += num;
        }
        return runningSum / array.length;
    }
    public static void main(String[] args) {
        System.out.println(10 + 99 + ":Java");

        // 8 Primitive Data Types
        // 6 Numeric: byte, short, int, long, float, double
        // 2 others: boolean, and char
        // Objects - String
    }
}