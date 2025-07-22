**Projeto:** SudokuGame.java <br />
**Nome:** Nathan Medeiros Cristiano<br />
**Data:** 07/2025<br />
**Disciplina:** Pensamento Computacional e Algoritmos<br />
**Professor:** Ramon Mayor Martins<br />

1.
**INTRODUÇÃO AO PROJETO** <br /> 
   O Sudoku é um jogo lógico baseado em números, com regras bem definidas: o tabuleiro é composto por uma matriz 9x9 dividida em 9 blocos 3x3, e o desafio é preencher todos os espaços vazios de forma que cada número de 1 a 9 apareça apenas uma vez por linha, por coluna e por bloco.

   O projeto foi desenvolvido usando a linguagem de programação JAVA, usando a IDE NetBeans. O Sudoku é um jogo que para ser desenvolvido e “traduzido” em linguagem de programação nos desafia um pouco, principalmente em JAVA. Pois temos que trabalhar com Arrays, montando uma matriz de matriz de tamanho máximo 9x9 porém o Sudoku é um jogo que tem sua matriz “partida” em blocos de 3x3, com isso me gerou um desafio grande, de entender onde começa e termina cada bloco de 3x3. Neste projeto se utiliza conceitos fundamentais da linguagem JAVA, como a programação orientada a objetos.

   Neste jogo a matriz inicial é pré-definida no código, usando uma metodologia “hard-code” . Para esta aplicação pode se fazer uma randomização inicial para cada vez que o jogo for iniciado, mas por conta de tempo e demanda de estudos, foi preferível deixar o projeto mais simples e evitar complexidade demasiada. 

   O código foi dividido em módulos, onde cada classe foi subdividida para sua respectiva função dentro do projeto. Temos a classe SudokuGame onde se encontra a classe principal, é a responsável  pelo loop principal e a interação com o usuário através do próprio terminal. SudokuBoard, representa o tabuleiro, armazena o estado atual e inicial, e controla as posições editáveis. SudokuValidator, válida se o número inserido pelo jogador pode ser colocado na posição, e verifica a linha, coluna e o bloco 3x3.


---

2.
**FUNCIONAMENTO DO JOGO**<br />
   O projeto estará disponibilizado em meu GitHub através deste link: 
Após fazer o download, abra em sua IDE de preferência, recomendo Visual Studio Code e o NetBeans. A classe principal deve ser compilada com os seguintes comandos “javac SudokuGame.java” após compilado pode se iniciar o jogo através do comando “ java SudokuGame”. Após isso o jogo será iniciado através do terminal. Não esqueça de seguir as regras do Sudoku para jogar!

---

3.
**MANUAL SUDOKU**<br />
   Preencher todas as células vazias do tabuleiro com números de 1 a 9, de forma que:
- Cada linha contém todos os números de 1 a 9, sem repetir.


- Cada coluna contém todos os números de 1 a 9, sem repetir.


- Cada uma das nove subgrades 3x3 (chamadas de regiões ou blocos) contenha todos os números de 1 a 9, sem repetir.

   Você não pode alterar os números que já vêm preenchidos no início do jogo.


Não pode haver repetição de números:
- na mesma linha


- na mesma coluna


- no mesmo bloco 3x3
O jogo termina quando todas as células forem preenchidas corretamente.

---

**REFERÊNCIAS**<br />
Matrizes em Java: https://codegym.cc/pt/groups/posts/pt.142.matrizes-em-java

Encapsulamento em Java : https://www.datacamp.com/pt/doc/java/encapsulation

Sudoku Algorithm Wiki: https://en.m.wikipedia.org/wiki/Sudoku_solving_algorithms

Sudoku Solvers: https://algocademy.com/link/?problem=sudoku&lang=java&solution=1
