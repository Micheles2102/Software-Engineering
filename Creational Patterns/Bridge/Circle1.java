package Bridge;
//CONCRETE IMPLEMENTOR
public class Circle1 implements DrawingApi {
    public void drawCircle(double x,double y ,double radious){
        System.out.println("Circle1 with x="+x+" y="+y+" radious="+radious);
    }
}
