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

    // && (And) || (or) !
    int idade = 35;
    double salario = 3500D;
    boolean  isDentrodaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
    boolean isDentrodaLeiMenorQueTrinta = idade < 35 && salario >= 3381;
    System.out.println("isDentrodaLeiMaiorQueTrinta "+isDentrodaLeiMaiorQueTrinta); 
    System.out.println("isDentrodaLeiMenorQueTrinta "+isDentrodaLeiMenorQueTrinta);

    double valorTotalContaCorrente = 200;
    double valorTotalContaPoupanca = 10000;
    float valorPlaystation = 5000F;
    boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
    System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

    // = += -= *= /= %=
    double bonus = 1800;
    bonus += 1000;
    bonus -= 1000;
    bonus *= 2;
    bonus /= 2;
    bonus %= 2;
    System.out.println(bonus);

    // ++ --
    int contador = 1;
    contador += 1; //contador = 2
    contador++;
    contador--;
    int contador2 = 0;
    System.out.println(contador);
    System.out.println(++contador2); 
  }
  }
x
