
public class Git_array {

  public static void main(String[] args) {

    final int LONGITUDNUMEROS = 30;
    final int INICIO = 1;
    final int FIN = 10;

    System.out.println("NUMEROS ALEATORIOS: ");

    int[] numeros = new int[LONGITUDNUMEROS];

    for (int i = 0; i < LONGITUDNUMEROS; i++) {
      numeros[i] = (int) (Math.random() * (FIN - INICIO + 1) + INICIO);
      System.out.print(numeros[i] + " ");
    }
    
    System.out.println();

    for (int i = 0; i < numeros.length; i++) {
      int contador = 0;

      for (int j = 0; j < numeros.length; j++) {
        if (numeros[i] == numeros[j]) {
          contador++;
        }
      }
      System.out.println("El numero " + numeros[i] + " aparece " + contador + " veces");
    }
  }
}
