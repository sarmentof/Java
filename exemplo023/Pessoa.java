package exemplo023;

public class Pessoa {

  public String nome;
  public String telefone;

  public void exibir(int quantidade) {
    for (int i = 0; i < quantidade; i++) {
      System.out.println(nome + " :: " + telefone);
    }
  }

}