public class Persona 
{
    private String nome;
    private int eta;
    private String impiego;
    private int stipendio;

    Persona(String nome, int eta, String impiego,int stipendio)
    {
        this.nome = nome;
        this.eta = eta;
        this.impiego = impiego;
        this.stipendio=stipendio;
    }

    String getNome()
    {
        return this.nome;
    }

    String getImpiego()
    {
        return this.impiego;
    }


    int getEta()
    {
        return this.eta;
    }

    int getStipendio(){
        return this.stipendio;
    }
    
}   
