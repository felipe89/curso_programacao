package EntidadePraticando;

public abstract class TaxPayer {

    private String nome;
    private Double anuallIncome;

    public TaxPayer(){
    }

    public TaxPayer(String nome, Double anuallIncome) {
        this.nome = nome;
        this.anuallIncome = anuallIncome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAnuallIncome() {
        return anuallIncome;
    }

    public void setAnuallIncome(Double anuallIncome) {
        this.anuallIncome = anuallIncome;
    }

    public abstract Double tax();
}

