package geometrical_object;

public class Circle extends GeometricObject{
    private double jari;

    public Circle(String color,String filled_color,int jari){
        super(color,filled_color);
        this.jari = jari;
    }

    public double calculateArea(){
        return this.jari * 3.14;
    }

    public String toString(){
        return String.format("Lingkaran dengan warna %s diisi %s dan jari-jari %f", super.getColor(), super.getFilledColor(), this.jari);
    }

}