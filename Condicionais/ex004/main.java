public class main {
  public static void main(String[] args) {
    // € 0 € 34,712 9.70%
    // € 34,713 € 68,607 37.35%
    // € 58,598 49.50%
   double salarioAnual =  70000;
   double primeiraFaixa = 9.70 / 100;
   double segundaFaixa = 37.35 / 100;
   double terceiraFaixa = 49.50 / 100;
   double valorImposto;
   if (salarioAnual <= 34712) {
    valorImposto = salarioAnual * primeiraFaixa;
   }else if(salarioAnual >= 34713 && salarioAnual <= 68507) {
    valorImposto = salarioAnual * segundaFaixa;
   }else {
    valorImposto = salarioAnual * terceiraFaixa;
   }
   System.out.println(valorImposto);
  }
}