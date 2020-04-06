package exemplo010;

public class Profissional extends Pessoa {
  private String profissao;

  Profissional(String nome, String telefone, String profissao) {
    super(nome, telefone);
    this.profissao = profissao;
  }

  @Override
  public void exibir() {
    // Chama o metodo exibir de Pessoa, imprimindo nome e telefone
    super.exibir();

    // Complementa a informacao acerta de Profissao
    System.out.println("\tTrabalha como " + profissao);
  }

}