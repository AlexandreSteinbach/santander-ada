import java.util.Arrays;

public class vetores {
  
  /**
   * @param args
   */
  public static void main (String[] args) {
/*
    String[] letras = new String[5];
    letras[0] = "A";
    letras[1] = "B";
    letras[2] = "C";
    letras[3] = "D";
    letras[4] = "E";

    for (int i=0; i < letras.length; i++) {
      System.out.println(letras[i]);
    }


    String[] letras = {"A", "B", "C", "D", "E"};
    for (int i=0; i < letras.length; i++) {
      System.out.println(letras[i]);
    }

    System.out.println(Arrays.toString(letras));
*/

    int[] numeros = {9, 10, 12, 25, 2};
    int maior = numeros[0];
    int menor = numeros[0];
    int media = 0;

    for (int i=0; i < numeros.length; i++) {
      if (numeros[i] > maior) {
        maior = numeros[i];
      }
      if (numeros[i] < menor) {
        menor = numeros[i];
      }
      media += numeros[i];
    }

    

    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    System.out.println("Média: " + media/numeros.length);

  }
}
