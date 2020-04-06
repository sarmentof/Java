package exemplo002;

public class Exemplo002 {
  public static void main(String[] args) {

    int a = 5, b = 32, c = 7;
    System.out.printf("A: %d\t B: %d\t C: %d\n", a, b, c);

    b = b - c;
    b /= a;
    System.out.printf("A: %d\t B: %d\t C: %d\n", a, b, c);

    b = a ^ c;
    System.out.printf("A: %d\t B: %d\t C: %d\n", a, b, c);

    b++;
    System.out.printf("A: %d\t B: %d\t C: %d\n", a, b, c);

  }
}