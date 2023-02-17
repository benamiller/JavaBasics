public class PremiumBankAccount extends BankAccount {
    public PremiumBankAccount(int accountNumber, String accountName, double balance) {
        super(accountNumber, accountName, balance);
    }

    @Override
    public void deposit(double depositAmount) {
        setBalance(getBalance() + depositAmount + 1);
    }
}
