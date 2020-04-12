package geometrical_object;

public class GeometricObject {
    // Data Field
    private String color;
    private String filled_color;
    private static int jumlah;

    //Constructor
    public GeometricObject(color,filled) {
        this.color = color;
        this.filled = filled;
        this.jumlah++;
    }

    //Getter
    public String getColor() {
        return this.color;
    }

    public String getFilledColor(){
        return this.filled_color;
    }

    //Setter
    public void changeColor() {
        this.color = color;
    }

    //Overwrite
    public String toString(){
        return String.format("Object Memiliki warna %s dan diisi dengan warna %s", this.color,this.filled_color);
    }

    //Method
    public String numOfObjectInClass(){
        return String.format("There are %f Object", this.jumlah);
    }
}