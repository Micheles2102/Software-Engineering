package Bridge;
//REFINED ABSTRACTION
public class CircleShape extends Shape {
    private double x,y,radious;
    public CircleShape(double x,double y,double radious,DrawingApi drawingApi){
        super(drawingApi);
        this.x=x;
        this.y=y;
        this.radious=radious;
    }
    public void draw(){
        drawingApi.drawCircle(x, y, radious);
    }
    public void resizebypercentage(double pct){
        radious*=pct;
    }
}
