package exemplo006;

public class Exemplo006 {
  public static void main(String[] args) {
    // Calculo do valor medio da sequencia y = f(x) = x * y
    // Media = Somatorio dos valores / quantidade
    // Limites 1 a 5

    double soma = 0.0;
    for (int x = 0; x <= 5; x++) {
      soma += Math.pow(x, 2); // eleva x a potencia 2 e acumula
    }
    System.out.println(soma / 5);

  }
}