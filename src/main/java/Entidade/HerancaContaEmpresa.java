package Entidade;

public class HerancaContaEmpresa extends HerancaConta{

    private Double loanlimit;

    public HerancaContaEmpresa(){
        super();
    }

    public HerancaContaEmpresa(Integer number, String holder, Double balance, Double loanlimit) {
        super(number, holder, balance);
        this.loanlimit = loanlimit;
    }

    public Double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(Double loanlimit) {
        this.loanlimit = loanlimit;
    }

    public void loan(double amount){
        if (amount <= loanlimit){
            balance += amount - 10.0;
        }
    }
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }
}
