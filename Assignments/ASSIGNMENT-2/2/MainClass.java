
import java.util.Scanner;

class BankAccount {
    public static Scanner sc = new Scanner(System.in);

    public String accountNumber;
    public float balance;

    public BankAccount() {

    }

    public BankAccount(String a, float b) {
        this.accountNumber = a;
        this.balance = b;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void Deposit() {
        System.out.print("Enter Amount Of Money To Deposit : ");
        float d = sc.nextFloat();
        balance += d;
        System.out.print("Account Balance : " + balance);
    }

    public void Withdraw() {
        System.out.print("Enter Amount Of Money To Withdraw : ");
        float w = sc.nextFloat();
        if (w < balance) {
            balance -= w;
            System.out.print("Account Balance : " + balance);
        }
        else {
            System.err.println("Insufficient Balance To Withdraw!!");
        }
    }

}

public class MainClass {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter Account Number : ");
        String acc = sc.next();
        System.out.print("Enter Balance : ");
        Float bala = sc.nextFloat();

        BankAccount a1 = new BankAccount(acc, bala);

        System.out.printf(" 1. Deposit Money. \n 2. Withdraw Money.\n Choose an option : ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                a1.Deposit();
                break;

            case 2:
                a1.Withdraw();
                break;
            default:
                throw new AssertionError();
        }

    }

}
