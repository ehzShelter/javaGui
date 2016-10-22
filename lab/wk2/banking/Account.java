package lab.wk2.banking;

public class Account
{
    private String accName;
    private String acid;
    float balance;

    // public Account() {
    //     this.balance = 100.0f;
    // }
    // above code essentially same meaning

    public Account() {
        super();
        this.balance = 100.0f;
    }

    public Account(String accountName, String accountID, float accountBalance) {
        this.accName = accountName;
        this.acid = accountID;
        this.balance = accountBalance;
    }

    public void setBalance(float reinitializedBalance) {
        this.balance = reinitializedBalance;
    }

    public float getBalance() {
        return this.balance;
    }

    public void deposit(float amount) {
        this.balance += amount;
    }

    public void withDraw(float amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Requested amount is greater than balance");
        }
    }

    public void transferTo(Account toAccount, float amount) {
        if (amount < this.balance) {
            this.withDraw(amount);
            toAccount.deposit(amount);
            System.out.println("amount transferred");
        } else {
            System.out.println("Something went wrong");
        }
    }
}
