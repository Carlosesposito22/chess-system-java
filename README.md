# Xadrez de Terminal em Java ♟️

Um jogo de xadrez completo e 100% funcional, desenvolvido em **Java puro** para ser executado diretamente no seu terminal.

## Sobre o Jogo

Este projeto é uma implementação do clássico jogo de xadrez, sem a necessidade de qualquer interface gráfica. Toda a interação, desde a visualização do tabuleiro até a movimentação das peças, acontece no terminal. O jogo foi cuidadosamente desenvolvido para incluir todas as regras oficiais, incluindo movimentos especiais complexos.

***

## Funcionalidades

* **Motor de Xadrez Completo:** Jogue uma partida de xadrez do início ao fim.
* **Validação de Movimentos:** O sistema valida cada jogada de acordo com as regras do xadrez.
* **Movimentos Especiais:** Suporte total para movimentos como:
    * **Roque** (pequeno e grande)
    * **En Passant**
    * **Promoção de Peão**
* **Interface de Terminal:** Tabuleiro claro e legível, atualizado a cada jogada.
* **Tratamento de Exceções:** O jogo lida com entradas inválidas e jogadas ilegais de forma elegante, solicitando ao jogador que tente novamente.

***

## Pré-requisitos

Para compilar e executar o projeto, você precisa ter o **Java Development Kit (JDK)** instalado em sua máquina.

* [Java JDK](https://www.oracle.com/java/technologies/downloads/)

***

## Como Executar

1.  **Clone o repositório** ou faça o download dos arquivos do projeto.
2.  Abra o terminal e **navegue até a pasta raiz** do projeto.
3.  **Execute o jogo** com o seguinte comando (ou execute direto no terminal da sua IDEA):

    ```bash
    java -cp bin com.chess.Program
    ```

***

## Como Jogar

O jogo utiliza a **notação de coordenadas** para mover as peças.

1.  O tabuleiro será exibido no terminal.
2.  Quando for a sua vez, o sistema pedirá a **posição da peça de origem** (ex: `e2`).
3.  Em seguida, informe a **posição de destino** (ex: `e4`).
4.  O tabuleiro será atualizado com a sua jogada, e será a vez do oponente.

Aproveite o jogo!
