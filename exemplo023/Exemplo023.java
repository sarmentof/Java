package exemplo023;

import java.lang.reflect.Field;

// Este codigo explica "Reflexividade Computacional"

public class Exemplo023 {

  public static void main(String[] args) throws Exception {

    Object objeto = Class.forName("exemplo023.Pessoa").newInstance();
    Class classe = objeto.getClass();

    // Reconhecendo os atributos do objeto...

    for (Field f : classe.getFields()) {
      System.out.println(f.getName() + " :: " + f.getType());
    }

    // Alterando os valores invocando o metodo...

    classe.getField("nome").set(objeto, "Joao");
    classe.getField("telefone").set(objeto, "3390-8264");

    classe.getMethod("exibir", int.class).invoke(objeto, 2);

  }

}