public class main {
  public static void main(String[] args) {
    // idade > 15 categoria infantil 
    // idade >= 15 && idade < 18 categoria juvenil
    // idade < 18 categoria adulta
    int idade = 12;
    String categoria = "";
    if (idade < 15) {
      categoria = "Categoria Infantil";
    } else if (idade >= 15 && idade < 18) {
      categoria = "Categoria juvenil";
    } else {
      categoria = "Categoria Adulta";
    }
    System.out.println(categoria);
  }
}