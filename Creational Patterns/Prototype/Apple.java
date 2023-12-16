package Prototype;

public class Apple implements Computer{
    private String name;
    private String processore;
    public Apple(String name,String processore){
        this.name=name;
        this.processore=processore;
    }

    public Apple (Apple prototype){
        this.name=prototype.name;
        this.processore=prototype.processore;
    }
    
    @Override
    public Computer clone(){
        return new Apple(this);
    }

    String getName(){
        return this.name;
    }
    
    String getProcessore(){
        return this.processore;
    }
    
    String setProcessore(String newProcessore){
        return this.processore=newProcessore;
    }
}
    

