package Entidade;

public class HerancaUpcastingDowncastingConta extends HerancaConta {

    private Double interestRate;

    public HerancaUpcastingDowncastingConta() {
        super();
    }

    public HerancaUpcastingDowncastingConta(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() { /*Metodo de atualização de saldo com base no valor depositado ou sacado*/
        balance += balance * interestRate;
    }
    @Override               /*Sobreposição de metodo já existente em outra classe*/
    public void withdraw(double amount) {
        balance -= amount;
    }
}

