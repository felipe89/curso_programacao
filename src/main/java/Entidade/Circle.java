package Entidade;

import Entidade.Enums.Cores;

public class Circle extends Forma{

    private Double radius;

    public Circle(double raio){
        super();
    }

    public Circle(Cores cores, Double radius) {
        super(cores);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
