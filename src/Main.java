import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static double getAverage(int[] array) {
        double runningSum = 0;
        for (int num : array) {
            runningSum += num;
        }
        return runningSum / array.length;
    }

    public static void sortArray(int[] array) {
        Arrays.sort(array);
    }
    public static void main(String[] args) {
        System.out.println(10 + 99 + ":Java");
        System.out.println("Java:" + 10 + 99);
        int[] array = {2, 4, 6, 8, 10, -1};
        System.out.println("Array is currently " + Arrays.toString(array));
        System.out.println("Array is changing");
        sortArray(array);
        System.out.println("Array is now " + Arrays.toString(array));
        System.out.println(Arrays.toString(array));

        BankAccount myBankAccount = new BankAccount(10001, "Student", 100.21);

        System.out.println(myBankAccount.getBalance());
        myBankAccount.deposit(10);
        System.out.println(myBankAccount.getBalance());

        BankAccount myBankAccount2 = new PremiumBankAccount(10001, "Student", 100.21);

        System.out.println(myBankAccount2.getBalance());
        myBankAccount2.deposit(10);
        System.out.println(myBankAccount2.getBalance());
    }
}