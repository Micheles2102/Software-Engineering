package Prototype;

public class Main {
    public static void main(String[] args){
        Acer prototypeAcer=new Acer("Acer","Intel i7");
        Acer cloneAcer= (Acer)prototypeAcer.clone();
        System.out.println(cloneAcer.getName());
        cloneAcer.setProcessore("Ryzen7");
        System.out.println("Processore Del prototipo: "+prototypeAcer.getProcessore());
        System.out.println("Processore Del clone: "+cloneAcer.getProcessore());
        System.out.println("------------------------------------");
        Apple prototypeApple=new Apple("Apple","Intel i5");
        Apple cloneApple= (Apple)prototypeApple.clone();
        System.out.println(cloneApple.getName());
        cloneApple.setProcessore("peppe");
        System.out.println("Processore Del prototipo: "+prototypeApple.getProcessore());
        System.out.println("Processore Del clone: "+cloneApple.getProcessore());

    }
}
