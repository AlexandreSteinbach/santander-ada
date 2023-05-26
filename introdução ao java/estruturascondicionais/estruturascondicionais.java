public class estruturascondicionais {

  public static void main(String[] args) {

    int nota = 70;

    if (nota <= 100 && nota >= 80) {
      System.out.println("Graduação A");
    } else if (nota < 80 && nota >= 70) {
      System.out.println("Graduação B");
    } else if (nota < 70 && nota >= 60) {
      System.out.println("Graduação C");
    } else if (nota < 60 && nota >= 50) {
      System.out.println("Graduação D");
    } else if (nota < 50) {
      System.out.println("Graduação E");
    } else {
      System.out.println("Nota inválida");
    }
  }
};