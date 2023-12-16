import java.util.List;

public class Persona {
    private String nome,ruolo;
    private int eta,costo;

    public Persona(String n,int e ,String r,int c){
        nome=n;
        eta=e;
        ruolo=r;
        costo=c;
    }

    public int getCosto(){
        return costo;
    }

    public int getEta(){
        return eta;
    }

    public String getNome(){
        return nome;
    }

    public String getRuolo(){
        return ruolo;
    }

    private static List<Persona> team=List.of(
            new Persona("Al",28,"Architect",44),
            new Persona("Claire",29,"Programmer",38),
            new Persona("Ed",26,"Programmer",36),
            new Persona("Pem",25,"Programmer",35),
            new Persona("Ed",32,"Architect",40)
        );

    public void conta(String ruolo){
        System.out.println("Hanno ruolo"+ ruolo +" : ");
        long c=team.stream().filter(p->p.getRuolo().equals(ruolo))
        .peek(p->System.out.println(p.getNome()+" "+ruolo)).count();
        System.out.println("\nCi sono "+ c + " "+ ruolo);
    }

    public void ruolo(){
        team.stream().map(p->p.getRuolo()).distinct()//mappa team in base al ruolo e poi applica distinct ritornandomi un ruolo distinto
        .peek(p->System.out.println("Ruolo "+p+ ": "))
        .forEach(p->team.stream()//per ogni p contenuto nello stream(p è il ruolo distinto)
            .filter(r->r.getRuolo().equals(p))//filtra il ruolo di r cosi che sia uguale a p
            .forEach(r->System.out.println("Nome: "+r.getNome()))   //ritornami il nome
        );
    }
    
}
