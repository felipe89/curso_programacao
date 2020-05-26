package EntidadePraticando;

public class Individual extends  TaxPayer {

    private Double healthExpenditure;

    public Individual() {
    }

    public Individual(String nome, Double anuallIncome, Double healthExpenditure) {
        super(nome, anuallIncome);
        this.healthExpenditure = healthExpenditure;
    }

    public Double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(Double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public Double tax() {
        if ( getAnuallIncome() < 20000.0){
            return getAnuallIncome() * 0.15 - healthExpenditure * 0.5;
        }
        else {
            return getAnuallIncome() * 0.25 - healthExpenditure * 0.5;
        }
    }
}

