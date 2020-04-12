package geometrical_object;

public class GeometricObject {
    // Data Field
    protected String color;
    protected String filled_color;
    private static int jumlah;

    //Constructor
    public GeometricObject(String color,String filled) {
        this.color = color;
        this.filled_color = filled;
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
        return String.format("There are %s Object", Integer.toString(this.jumlah));
    }
}