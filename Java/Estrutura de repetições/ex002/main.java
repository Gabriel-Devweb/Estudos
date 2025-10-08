public class main {
  public static void main(String[] args) {
    //imprima todos os numeros pares de 5 a 1000000
    for (int contagem = 1;contagem <= 1000000; contagem++) {
      if (contagem % 2 == 0)
        System.out.println(contagem);
    }
  }
}