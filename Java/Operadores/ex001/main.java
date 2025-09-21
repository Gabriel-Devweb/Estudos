public class main {
  public static void main(String[] args) {
    // + - / *
    int numero01 = 10;
    int numero02 = 20;
    double resultado = numero01 / (double) numero02;
    System.out.println(resultado);

    // % 
    int resto = 20 % 2;
    System.out.println(resto);

    // < > <= >= === !=
    boolean isDezMaiorQueVinte = 10 > 20;
    boolean isDezMenorQueVinte = 10 < 20;
    boolean isDezIgualAVinte = 10 == 20;
    boolean isDezIgualADez = 10 == 10;
    boolean isDezdiferenteDez = 10 != 10;
    System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
    System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
    System.out.println("isDezIgualAVinte " +isDezIgualAVinte);
    System.out.println("isDezIgualADez " +isDezIgualADez);
    System.out.println("isDezdiferenteDez " +isDezdiferenteDez);
  }
  }
