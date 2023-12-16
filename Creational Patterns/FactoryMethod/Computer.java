package FactoryMethod;
//CONCRETE CREATOR
public class Computer  {
  private SistemaOperativo sistemaoperativo;
  public Computer(SistemaOperativo so){
    sistemaoperativo=so;
  }
  void getSistema(){
    String sistema=sistemaoperativo.crea();
    System.out.println(sistema);
  }
  void modificaSistema(String word){
    String modificaeffettuata=sistemaoperativo.modifica(word);
    System.out.println(modificaeffettuata);
  }
}
