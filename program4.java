/*Create an interface called ATM with the following method signatures:
void checkBalance()void withdraw(double amount)void deposit(double amount)
Create a class called BankAccount that v the ATM interface. The BankAccount class should have the following properties:
String accountNumberString accountNamedouble balance
Implement the methods of the ATM interface in the BankAccount class. For example, the checkBalance() method should print out the current balance of the account, the withdraw(double amount) method should subtract the specified amount from the balance, and the deposit(double amount) method should add the specified amount to the balance.
Write a Main class that creates an instance of BankAccount and allows the user to interact with the account by calling the checkBalance(), withdraw(double amount), and deposit(double amount) methods. For example, the user should be able to input an amount to withdraw or deposit, and the program should update the balance accordingly.*/
interface ATM {
    void checkBalance();
    void withdraw(double amount);
    void deposit(double amount);
}

class BankAccount implements ATM {
    private String accountNumber;
    private String accountName;
    private double balance;

    public BankAccount(String accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("New balance: " + balance);
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
            System.out.println("New balance: " + balance);
        }
    }
}

 class program4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "aaaa", 500.00);
        Scanner scanner = new Scanner(System.in);

        int option;
        double amount;

        do {
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    account.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;

                case 4:
                    System.out.println("Thank you for banking with us");
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }

        } while (option != 4);
    }
}
