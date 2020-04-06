package exemplo011;

public class Morcego extends Mamifero implements Voo {
  public Morcego() {
    familia = "Phyllostomidae";
  }

  @Override
  public void mamar() {
    System.out.println("Morcego mamando...");
  }

  @Override
  public void voar() {
    System.out.println("Morcego voando...");
  }

}