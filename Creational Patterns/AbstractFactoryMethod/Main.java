package AbstractFactoryMethod;
public class Main {
    public static void main(String[] args){
        Computer c1=new createAcer();
        Computer c2=new createApple();
        Marchio m1=c1.getLogo();
        Processore p1=c1.getProcessore();
        m1.getMarchio();
        p1.CPU();
        System.out.println("--------------------");
        Marchio m2=c2.getLogo();
        Processore p2=c2.getProcessore();
        m2.getMarchio();
        p2.CPU();
    }
}
