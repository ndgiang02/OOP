import java.util.ArrayList;
import java.util.Objects;

public class Account {

    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /**
     * Account constructor.
    /**
     * Deposit an amount to account balance and add to transaction list.
     *
     * @param amount amount to deposit
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            this.balance += amount;
            Transaction transaction = new Transaction("deposit", amount, this.balance);
            transitionList.add(transaction);
        }
    }

    /**
     * Withdraw an amount from account and add to transaction list.
     *
     * @param amount amount to withdraw
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            this.balance -= amount;
            Transaction transaction = new Transaction("withdraw", amount, this.balance);
            transitionList.add(transaction);
        }
    }

    /**
     * Do a transaction and add to list.
     *
     * @param amount    transaction amount
     * @param operation transaction operation
     */
    public void addTransaction(double amount, String operation) {
        if (Objects.equals(operation, Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (Objects.equals(operation, Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Print transaction list.
     */
    public void printTransaction() {
        int i = 1;
        for (Transaction transaction : transitionList) {
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.%n",
                    i++,
                    (Objects.equals(transaction.getOperation(), Transaction.DEPOSIT))
                            ? "Nap tien" : "Rut tien",
                    transaction.getAmount(),
                    transaction.getBalance());
        }
    }

}