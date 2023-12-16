package Prototype;

public class Acer implements Computer{
    private String name;
    private String processore;
    public Acer(String name,String processore){
        this.name=name;
        this.processore=processore;
    }

    public Acer (Acer prototype){
        this.name=prototype.name;
        this.processore=prototype.processore;
    }
    
    @Override
    public Computer clone(){
        return new Acer(this);
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
