package Entidade;

public class ConversorMoeda {

    public static final double IOF = 0.06;

    public static double valorDolar (double cotacao, double dolar){
        return cotacao * dolar;
    }
    public static double taxa (double dolarCalculado){
        return dolarCalculado * IOF;
    }
}
