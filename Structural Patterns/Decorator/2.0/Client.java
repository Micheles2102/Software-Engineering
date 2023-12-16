package DecoratorProvaù;

public class Client {
    public static void main(String[] args){
        Panino panino=new Ham();
        panino=new Patatine(new Cetrioli(panino));
        System.out.println(panino.getCosto());
        System.out.println(panino.getDescription());
    }
}
