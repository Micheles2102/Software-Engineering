package Bridge;
//ABSTRACTION
public abstract class Shape {
    protected DrawingApi drawingApi;
    protected Shape(DrawingApi drawingApi){
        this.drawingApi=drawingApi;
    }
    public abstract void draw();
    public abstract void resizebypercentage(double pct);
}
