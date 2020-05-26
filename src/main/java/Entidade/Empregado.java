package Entidade;

public class Empregado {

    public String nome;
    public double salarioBruto;
    public double taxas;

    public double netSalario(){
        return salarioBruto - taxas;
    }
    public void aumentoSalario(double percente){
        salarioBruto += salarioBruto * percente / 100.0;
    }
    public String toString(){
        return nome + ", $" + String.format("%.2f", netSalario());
    }
}
