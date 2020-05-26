package Entidade;

import Entidade.Enums.NivelCargo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NivelCargo cargo;
    private Double baseSalarial;

    /*Declarar as associações das demais classes(Composições Objetos)*/
    private Departamento departamento;
    private List<HorasContrato> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelCargo cargo, Double baseSalarial, Departamento departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.baseSalarial = baseSalarial;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelCargo getCargo() {
        return cargo;
    }

    public void setCargo(NivelCargo cargo) {
        this.cargo = cargo;
    }

    public Double getBaseSalarial() {
        return baseSalarial;
    }

    public void setBaseSalarial(Double baseSalarial) {
        this.baseSalarial = baseSalarial;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasContrato> getContratos() {
        return contratos;
    }

    public void addContrato(HorasContrato contrato) {
        contrato.add(contrato);
    }

    public void removeContrato(HorasContrato contrato) {
        contrato.remove(contrato);
    }

    /*Implementação da renda de contatos ano e mes utilizando metodo Calendar / FOR / IF */
    public double renda(int ano, int mes) {
        double soma = baseSalarial;
        Calendar cal = Calendar.getInstance();
        for (HorasContrato c : contratos) {
            cal.setTime(c.getDate());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
                    if(ano == c_ano && mes == c_mes){
                        soma += c.valorTotal();
                    }
        }
        return soma;
    }
}

