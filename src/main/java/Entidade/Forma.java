package Entidade;

import Entidade.Enums.Cores;

public abstract class Forma {

    private Cores cores;

    public Forma() {
    }

    public Forma(Cores cores) {
        this.cores = cores;
    }

    public Cores getCores() {
        return cores;
    }

    public void setCores(Cores cores) {
        this.cores = cores;
    }

    public abstract double area();
}
