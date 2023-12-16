package Bridge;
//Client
public class BridgePattern {
    public static void main(String[] args){
        Shape[] shapes= new Shape[]{
            new CircleShape(1, 2, 3, new Circle1()),
            new CircleShape(4, 7, 11, new Circle2())
        };
        for(Shape shape:shapes){
            shape.resizebypercentage(2.5);
            shape.draw();
        }
    }
}
