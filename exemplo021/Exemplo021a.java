package exemplo021;

import java.util.ArrayList;

public class Exemplo021a {

  public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();

    lista.add("Primeiro");
    lista.add("Segundo");
    lista.add("Terceiro");

    lista.forEach((x) -> {
      System.out.println(x);
    });
  }

}