package exemplo021;

import java.util.ArrayList;

public class Exemplo021 {

  public static void main(String[] args) {
    ArrayList<String> lista = new ArrayList<>();

    lista.add("Primeiro");
    lista.add("Segundo");
    lista.add("Terceiro");

    for (String x : lista) {
      System.out.println(x);
    }
  }

}