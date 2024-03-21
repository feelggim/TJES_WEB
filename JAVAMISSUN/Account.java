public class Account {
    private String accountNumber;
    private String accountHolder;
    private int balance;
    private int password;

    public Account() {
        this.accountNumber = "계좌없음";
        this.accountHolder = "이름없음";
        this.balance = 0;
        this.password = 0;
    }

    public Account(String accountNumber, String accountHolder, int balance, int password) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void deposit(int amount) {
        if (amount <= 1000000) {
            this.balance += amount;
        }
    }

    public boolean withdraw(int amount, int password) {
        if (amount <= 1000000 && password == (this.password))
            
        
        {
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
