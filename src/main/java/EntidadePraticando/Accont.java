package EntidadePraticando;

public class Accont {

    private Integer number;
    private String holder;
    private double balance;
    private double withDrawLimit;

    public Accont(Integer number, String holder, double balance, double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public  void withdraw(double amount){
        if (amount > withDrawLimit){
            throw new ExceptionsAccont("The amount exceeds withdraw limit");
        }
        if (amount > balance){
            throw new ExceptionsAccont("Not enough balance");
        }
        balance -= amount;
    }
}
