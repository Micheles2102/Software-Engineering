package Bridge;
//CONCRETE IMPLEMENTOR
public class Circle2 implements DrawingApi {
    public void drawCircle(double x,double y ,double radious){
        System.out.println("Circle2 with x="+x+" y="+y+" radious="+radious);
    }
}

