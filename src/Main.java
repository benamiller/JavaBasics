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