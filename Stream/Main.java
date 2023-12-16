import java.util.stream.Collectors;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        
        Persona persona=new Persona("Mario", 30, "Engineer", 50);
        persona.conta("Architect");
        persona.ruolo();
    }
} 