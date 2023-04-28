import java.util.List;

public class Jogador {

    private static final int TAMANHO_MATRIZ = 8;
    private String nome;

    private int pontos = 0;
    private char[][] meuJogo;
    private char[][] jogoDoAdversario;

    public Jogador(String nome, char[][] meuJogo, char[][] jogoDoAdversario) {
        this.meuJogo = meuJogo;
        this.jogoDoAdversario = jogoDoAdversario;
    }

    public void atirar(char[][] meuJogo, int x, int y) {
        meuJogo[x][y] = 'X';
        this.verificarSeAcertou(meuJogo, x, y);
    }

    public void preencherTabuleiro(int x, int y, char arma) {
        meuJogo[x][y] = arma;
    }

    public void verificarSeAcertou(char[][] meuJogo, int x, int y) {
        if (meuJogo[x][y] == 'S') {
            this.pontos = this.pontos + 3;
            System.out.printf("Acertou! Pontos: " + this.pontos);
        } else if(meuJogo[x][y] == 'C') {
            this.pontos = this.pontos + 2;
            System.out.printf("Acertou! Pontos: " + this.pontos);
        } else if(meuJogo[x][y] == 'P') {
            this.pontos = this.pontos + 1;
            System.out.printf("Acertou! Pontos: " + this.pontos);
        } else {
            System.out.printf("Errou!");
        }
    }

    public void escreveMatriz(){
        for (int i = 0; i < TAMANHO_MATRIZ; i++) {
            for (int j = 0; j < TAMANHO_MATRIZ; j++) {
                System.out.print(this.meuJogo[i][j]);
            }
            System.out.println("");
        }
    }


}
