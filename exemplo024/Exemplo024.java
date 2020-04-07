package exemplo024;

public class Exemplo024 {

  public static void main(String[] args) {
    Object[] objetos = { new Carro(), "Mazda" };

    for (Object obj : objetos) {
      Class c1 = obj.getClass();

      if (c1.isAnnotationPresent(Autoria.class)) {

        // *(Autoria)* promove conversao de tipo da variavel c1
        Autoria a1 = (Autoria) c1.getAnnotation(Autoria.class);
        System.out.println("Classe " + c1.getName() + " escrita por " + a1.autor() + " em " + a1.ano() + ".");
      } else {
        System.out.println("Classe " + c1.getName() + " sem autoria definida.");
      }
    }
  }

}