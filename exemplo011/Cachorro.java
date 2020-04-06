package exemplo011;

public class Cachorro extends Mamifero {
  public Cachorro() {
    familia = "Canidae";
  }

  @Override
  public void mamar() {
    System.out.println("Cachorro mamando...");
  }

}