import java.util.Scanner;
import java.util.Random;

class Account {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();

    String Name;
    private long cardNumber;
    private int pin;
    private double balance;

    public void setName(String Name) {
        System.out.println("Enter your name:");
        Name = sc.nextLine();
        if (Name != null && !Name.isEmpty() && !Name.matches("[0-9]+")) {
            this.Name = Name;
        } else {
            System.out.println("Invalid name. Please enter a valid name.");
            setName(Name);
        }
    }

    public String getName() {
        return Name;
    }

    public void setPin(int pin) {
        System.out.println("Enter your PIN:");
        pin = sc.nextInt();
        if (pin >= 1000 && pin <= 9999) {
            this.pin = pin;
        } else {
            System.out.println("Invalid PIN. Please enter a 4-digit PIN.");
            setPin(sc.nextInt());
        }
    }

    public int getPin() {
        return pin;
    }

    public double AddBalance(double balance) {
        System.out.println("Enter Amount to deposit:");
        balance = sc.nextDouble();
        if (balance > 0) {
            this.balance += balance;
            System.out.println("Amount deposited successfully. New balance: ₹" + this.balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
            AddBalance(sc.nextDouble());
        }
        return this.balance;
    }

    public double getBalance() {
        return balance;
    }

    public long getCardNumber() {
        if (cardNumber == 0) {

            long min = 1_0000_0000_0000_000L;
            long max = 9_9999_9999_9999_999L;

            long cardNumber = min + (long) (r.nextDouble() * (max - min + 1));
            this.cardNumber = cardNumber;
            long last4 = cardNumber % 10000;

        }
        return cardNumber;
    }

    public long last4() {
        return getCardNumber() % 10000;
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + getName());
        System.out.println("Card Number: " + getCardNumber());
        System.out.println("Balance: ₹" + getBalance());
    }
    
    public void Withdraw() {
        System.out.println("Enter amount to withdraw:");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= getBalance()) {
             this.balance = this.balance - amount; 
            System.out.println("Withdrawal successful. New balance:  ₹" + this.balance);
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a valid amount.");
            Withdraw();
        }
    }
}