public class Main {
    public static void main(String[] args) {
        Account acc = new Account();

        // ! Set account details
        acc.setName("");
        acc.setPin(0);
        acc.displayAccountDetails();

        // ! All operations are done through ATM class
        ATM atm = new ATM();
        atm.Entercard(acc);

    }
}

// ! Coded By Anuraag :)