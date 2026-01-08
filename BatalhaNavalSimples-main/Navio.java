import java.util.Random;

public class Navio {

    public int[] criarNavio() {
        int[] navio = new int[7];
        Random aleatorio = new Random();

        int n1 = aleatorio.nextInt(6);
        int n2 = n1 + 1;
        int n3 = n2 + 1;

        navio[n1] = 1;
        navio[n2] = 1;
        navio[n3] = 1;

        return navio;

    }


}
