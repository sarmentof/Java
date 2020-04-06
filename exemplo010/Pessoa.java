package exemplo010;

public class Pessoa {
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  private String nome;
  private String telefone;

  public Pessoa(String nome, String telefone) {
    this.nome = nome;
    this.telefone = telefone;
  }

  public void exibir() {
    System.out.println(getNome() + ": " + getTelefone());
  }

}