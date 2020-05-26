package EntidadePraticando;

public class Company extends  TaxPayer {

    private int numberOfEmployess;

    public Company(){
    }
    public Company(String nome, Double anuallIncome, int numberOfEmployess) {
        super(nome, anuallIncome);
        this.numberOfEmployess = numberOfEmployess;
    }

    public int getNumberOfEmployess() {
        return numberOfEmployess;
    }

    public void setNumberOfEmployess(int numberOfEmployess) {
        this.numberOfEmployess = numberOfEmployess;
    }

    @Override
    public Double tax() {
        if ( numberOfEmployess < 10){
            return getAnuallIncome() * 0.14;
        }
        else {
            return getAnuallIncome() * 0.16;
        }
    }
}
