
// DadoSimples.java
import java.util.Random;

public class DadoSimples implements IDado {
    private int lados;
    private int valorJogada;
    private final Random random;

    public DadoSimples(int lados) {
        this.lados = lados;
        this.random = new Random();
    }

    @Override
    public void rolar() {
        valorJogada = random.nextInt(lados) + 1;
    }

    @Override
    public int getValor() {
        return valorJogada;
    }
}
