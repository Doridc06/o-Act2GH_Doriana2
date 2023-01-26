
public class Git_array {
  public static void main(String[] args) {


    final int LONGITUDNUMEROS = 30;
    final int INICIO = 1;
    final int FIN = 10;

    int[] numeros = new int[LONGITUDNUMEROS];
    
    for (int i = 0; i < LONGITUDNUMEROS; i++) {
      numeros[i] = (int) (Math.random() * (FIN - INICIO + 1) + INICIO);
    
    System.out.println(numeros[i]);
    }
  }
}
