package geometrical_object;

public class SegiEmpat extends GeometricObject{
    protected int sisi1;
    protected int sisi2;

    public SegiEmpat(String color,String filled_color,int sisi1,int sisi2){
        super(color,filled_color);
        this.sisi1=sisi1;
        this.sisi2=sisi2;
    }

    public double calculateArea(){
        return this.sisi1 * this.sisi2;
    }
    public double calculateKeliling(){
        return this.sisi1*this.sisi2;
    }
}