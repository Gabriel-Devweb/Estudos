public class main {
  public static void main(String[] args) {
    //Byte, short,int float e double 0
    //char '\u0000'
    // boolean false
    // String null
    String[] nomes = new String[3];
    nomes[0] = "Maria";
    nomes[1] = "Gabriel";
    nomes[2] = "Ayala";
    //nomes[3] = "Ysis";
    for (int i = 0; i < nomes.length; i++) {
      System.out.println(nomes[i]);
    }
    nomes = new String[3];
  }
}