package test_task;

public interface BankAccount {

    public int compareTo (BankAccount toAccountTemp);

    public void withdraw (int transferAmount);

    public void deposit (int transferAmount);

}
