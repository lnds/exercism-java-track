/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.clear
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/
class BankAccount {

    private int balance = 0;
    private boolean closed = true;

    void open() {
        closed = false;
    }

    synchronized void deposit(int amount) throws BankAccountActionInvalidException {
        if (closed) {
            throw new BankAccountActionInvalidException("Account closed");
        }
        if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
        balance += amount;
    }

    synchronized void withdraw(int amount) throws BankAccountActionInvalidException {
        if (closed) {
            throw new BankAccountActionInvalidException("Account closed");
        }
        if (amount < 0) {
            throw new BankAccountActionInvalidException("Cannot deposit or withdraw negative amount");
        }
        if (balance == 0) {
            throw new BankAccountActionInvalidException("Cannot withdraw money from an empty account");
        }
        if (balance < amount) {
            throw new BankAccountActionInvalidException("Cannot withdraw more money than is currently in the account");
        }
        balance -= amount;
    }

    void close() {
        closed = true;
    }

    int getBalance() throws BankAccountActionInvalidException {
        if (closed) {
            throw new BankAccountActionInvalidException("Account closed");
        }
        return balance;
    }

}