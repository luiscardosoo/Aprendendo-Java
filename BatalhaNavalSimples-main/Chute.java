public class Chute {
    int[] navioPosicoes;

    public Chute(int[] posicoes) {
        this.navioPosicoes = posicoes;
    }

    int guess(int chute) {
            if (navioPosicoes[chute] == 1) {
                return 1;
            } else {
                return 0;
            }
    }
}
