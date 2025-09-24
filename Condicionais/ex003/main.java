public class main {
  public static void main(String[] args) {
    //Doar se salário for > 5000
   double salario = 6000;
   String mensagemDoar = "Eu vou doar 500 para o DevDojo";
   String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
   String resultado;
   if (salario > 5000) {
     resultado = mensagemDoar;
   } else {
    resultado = mensagemNaoDoar;
   }
   System.out.println(resultado);
  }
}