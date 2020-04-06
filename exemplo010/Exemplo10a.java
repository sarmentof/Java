package exemplo010;

public class Exemplo10a {
  public static void main(String[] args) {
    Pessoa[] pessoas = { new Pessoa("Joao", "3390-8265"), new Pessoa("Maria", "3356-6586"),
        new Profissional("Luiz", "3353-6583", "Advogado") };

    for (int i = 0; i < 3; i++)
      pessoas[i].exibir();
  }
}