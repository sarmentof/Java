package exemplo011;

public class Exemplo11a {
  public static void main(String[] args) {
    Object[] objetos = { new Gato(), new Morcego(), new Cachorro() };

    for (int i = 0; i < 3; i++) {
      if (objetos[i] instanceof Voo)
        // Conversao de tipos (type cast) necessaria
        ((Voo) objetos[i]).voar();
    }
  }

}