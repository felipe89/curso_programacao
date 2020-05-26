package Entidade;

public abstract class HerancaConta {

    private Integer number;
    private String holder;
    protected Double balance;

    public HerancaConta(){

    }
    public HerancaConta(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    public void withdraw(double amount){    /*Criando metodo de saque*/
        balance -= amount + 5.0;
    }

    public  void deposit (double amount){  /*Criando metodo de deposito */
        balance += amount;
    }
}
