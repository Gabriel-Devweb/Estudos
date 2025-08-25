<!DOCTYPE html>
<html lang="pr-br">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Tipos primitivos em PHP</title>
</head>
<body>
  <h1>Teste de tipos primitivos</h1>
  <?php 
  //$n = 300;
  //echo "O valor da variável é $n <br>"; 

  //0x = hexadecimal 0b = binário 0 = Octal
  //$num = 010;
  //echo "O valor da variável é $num <br>";

  //$v = "Gabriel";
  //var_dump($v);

  //$Num = (int) 3e2; //3 x 10(2) coeção
  //echo "O valor é $Num <br>";
  //var_dump($Num);

  //$numero = (int) 950;
  //var_dump($numero);

  //$casado = true;
  //print "O valor para casado é $casado";

  //$vet = [6,2.5,"Maria",3,false];
  //var_dump($vet);
  
  class Pessoa {
    private string $nome;
  }
  $p = new Pessoa;
  var_dump($p);
  ?>
</body>
</html>