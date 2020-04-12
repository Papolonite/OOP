package geometrical_object;

public class Controller{
    public static void main(String[] args) {
        GeometricObject a = new GeometricObject("blue", "Yellow");
        GeometricObject b = new GeometricObject("blue", "Yellow");
        GeometricObject c = new GeometricObject("blue", "Yellow");
        System.out.println(a.numOfObjectInClass());
        System.out.println(b.numOfObjectInClass());
        System.out.println(c.numOfObjectInClass());
        
    }
}