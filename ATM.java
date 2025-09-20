import java.util.Scanner;

class ATM {
    Scanner sc = new Scanner(System.in);

    public void Entercard(Account acc) {
        System.out.println("Enter your card last 4-Digit:");
        long card = sc.nextLong();
        if (card == acc.last4()) {
            System.out.println("-----------------------------------------");
            Enterpin(acc);
        } else {
            System.out.println("Invalid card number. Please enter correct 4-digit Number.");
            Entercard(acc);
        }
    }

    public void Enterpin(Account acc) {
        int attempts = 0;
        boolean success = false;

        while (attempts < 3) {
            System.out.println("Enter Pin:-");
            int pin = sc.nextInt();
            if (pin == acc.getPin()) {
                chooseOption(acc);
                success = true;
                break;
            } else {
                attempts++;
                if (attempts < 3) {
                    System.out.println("Wrong Pin.... Attempts left"+(3-attempts));
                }
            }
            if(!success){
                System.out.println("Too many wrong attempts.... Try again after 24 hours");
                System.exit(0);
            }
        }
    }

    public void chooseOption(Account acc) {
        System.out.println("Select Option");
        System.out.println("1. Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check balance");
        System.out.println("4.Exit");
        System.out.println("----------------------------------------------------");

        while (true) {
            int selection = sc.nextInt();
            switch (selection) {
                case 1 -> {
                    System.out.println("You selected Withdraw");
                    acc.Withdraw();
                    chooseOption(acc);
                    break;
                }

                case 2 -> {
                    System.out.println("You selected Deposit:");
                    acc.AddBalance(acc.getBalance());
                    chooseOption(acc);
                    break;
                }

                case 3 -> {
                    System.out.println("You selected Check balance");
                    System.out.println("Your balance is: ₹" + acc.getBalance());
                    chooseOption(acc);
                    break;
                }

                case 4 -> {
                    System.out.println("Exiting the ATM. Thank you! visit again.");
                    System.exit(0);
                    break;
                }

                default -> {
                    System.out.println("Invalid selection. Please try again.");
                    chooseOption(acc);
                    break;
                }
            }
        }
    }
}