package DesignPatternStrutturali.Adapter;

//ADAPTEE
public class Password {
    private String password;
    private int sicurezza;
    Password(String password,int sicurezza){
        this.password=password;
        this.sicurezza=sicurezza;
    }

    public void setPassword(String Password,int sicurezza){
        this.password=Password;
        this.sicurezza=sicurezza;
    }

    public int getSicurezza(){
        this.sicurezza=password.length();
        return sicurezza;
    }

    public String getPassword(){
        return this.password;
    }
}
