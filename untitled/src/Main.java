import java.util.Scanner;

public class Main {

    public static void preencheVetor(char[][] array, int tamanho ) {
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                array[i][j] = '0';
            }
        }
    }

    public static void preencheTabuleiro(char[][] meuJogo) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a posição do submarino!");
            int x = input.nextInt();
            int y = input.nextInt();
            meuJogo[x][y] = 'S';
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Informe a posição do Cruzador!");
            int x = input.nextInt();
            int y = input.nextInt();
            meuJogo[x][y] = 'C';
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("Informe a posição do Porta-aviões!");
            int x = input.nextInt();
            int y = input.nextInt();
            meuJogo[x][y] = 'P';
        }
    }
    public static void main(String[] args) {

        char[][] meuJogo = new char[8][8];
        preencheVetor(meuJogo, 8);

        char[][] jogoDoAdversario = new char[8][8];
        preencheVetor(jogoDoAdversario, 8);

        System.out.println("Jogador 1: Preencha seu tabuleiro!");
        preencheTabuleiro(meuJogo);

        System.out.println("Jogador 2: Preencha seu tabuleiro!");
        preencheTabuleiro(jogoDoAdversario);

        Jogador jogador1 = new Jogador("Teste", meuJogo, jogoDoAdversario);
        Jogador jogador2 = new Jogador("Teste", meuJogo, jogoDoAdversario);

        jogador2.escreveMatriz();
        jogador1.escreveMatriz();
        System.out.println("Hello world!");
    }
}