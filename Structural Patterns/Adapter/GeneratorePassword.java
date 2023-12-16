package DesignPatternStrutturali.Adapter;
public class GeneratorePassword implements Computer{
    private Password passwordutente;
    public GeneratorePassword(Password passwordutente){
        this.passwordutente=passwordutente;
    }
    
    public void setPassword(String password){
        passwordutente.setPassword(password,passwordutente.getSicurezza());
    }

    public String getPassword(){
        return passwordutente.getPassword();
    }
}
