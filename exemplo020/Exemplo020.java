package exemplo020;

public class Exemplo020 {

  public static void main(String[] args) {
    Pilha<Integer> pilha1 = new Pilha<>();

    pilha1.empilhar(5);
    pilha1.empilhar(7);
    pilha1.empilhar(9);

    Integer x;

    while ((x = pilha1.desempilhar()) != null) {
      System.out.println(x);
    }
  }

}