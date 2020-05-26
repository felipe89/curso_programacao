package Entidade;

import Entidade.Enums.Cores;

public class Rectangle extends Forma{

    private Double width;
    private Double height;

    public Rectangle(){
        super();
    }
    public Rectangle(Cores cores, Double width, Double height) {
        super(cores);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
