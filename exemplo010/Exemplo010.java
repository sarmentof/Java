package exemplo010;

public class Exemplo010 {
  public static void main(String[] args) {
    // Instanciando os objetos p1 e p2
    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa();

    // Preenchimento dos atributos dos objetos p1 e p2
    p1.nome = "Joao";
    p1.telefone = "1111-1111";

    p2.nome = "Aristides";
    p2.telefone = "2222-2222";

    // Chamada ao metodo exibir em p1 e p2
    p1.exibir();
    p2.exibir();

  }

}