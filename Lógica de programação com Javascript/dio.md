# 🚀 Desafios – Bootcamp DIO: Lógica de Programação com JavaScript e Git/GitHub

Este diretório reúne os desafios práticos realizados durante o bootcamp da **DIO (Digital Innovation One)** voltado para lógica de programação com **JavaScript**, além de boas práticas com **Git e GitHub**.

Cada desafio foi desenvolvido com o objetivo de praticar lógica condicional, funções, classes e estruturas fundamentais da linguagem.

---

## 📚 Desafios Resolvidos

### 1. 🧠 **Classificação de Nível por XP**

**Descrição:**  
Dado o nome de um herói e sua pontuação de experiência (XP), o programa determina o nível em que ele se encontra de acordo com a tabela:

| XP         | Nível       |
|------------|-------------|
| 0 - 1000   | Ferro       |
| 1001-2000  | Bronze      |
| 2001-5000  | Prata       |
| 5001-7000  | Ouro        |
| 7001-8000  | Platina     |
| 8001-9000  | Ascendente  |
| 9001-10000 | Imortal     |
| 10000+     | Radiante    |

**Exemplo de saída:**

O Herói de nome Gabriel está no nível de Ouro

---

### 2. 🏆 **Sistema de Partidas Ranqueadas**

**Descrição:**  
Recebe o número de vitórias e derrotas de um jogador e calcula seu **saldo de vitórias**. Com base nesse saldo, classifica o nível do herói.

| Vitórias   | Nível      |
|------------|------------|
| 0-10       | Ferro      |
| 11-20      | Bronze     |
| 21-50      | Prata      |
| 51-80      | Ouro       |
| 81-90      | Diamante   |
| 91-100     | Lendário   |
| 101+       | Imortal    |

**Exemplo de uso:**
```js
calcularRanked(75, 20);

Saída esperada:

O Herói tem de saldo de 55 está no nível de Ouro


---

3. ⚔️ Classe do Herói e Sistema de Ataque

Descrição:
Criação de uma classe Heroi com propriedades e um método atacar(), onde o tipo do herói determina o tipo de ataque.

Tipo do Herói	Ataque usado

mago	usou magia
guerreiro	usou espada
monge	usou artes marciais
ninja	usou shuriken


Exemplo de uso:

const heroi = new Heroi("Gabriel", 15, "ninja")
heroi.atacar()

Saída esperada:

O ninja atacou usando shuriken


---

🛠 Tecnologias Utilizadas

JavaScript (ES6)

Git & GitHub

Editor da DIO (web.dio.me) + VS Code



---

✍️ Autor

Gabriel Barreto
🔗 GitHub: @Gabriel-Devweb


---

📌 Esses desafios foram importantes para reforçar os fundamentos da lógica de programação e treinar o uso de estruturas essenciais da linguagem JavaScript.