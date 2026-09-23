
// DadoComHistorico.java
import java.util.ArrayList;
import java.util.List;

public class DadoComHistorico extends DadoDecorator {
    private List<Integer> historico;

    public DadoComHistorico(IDado dado) {
        super(dado);
        this.historico = new ArrayList<>();
    }

    @Override
    public void rolar() {
        super.rolar(); // Executa a rolagem do dado original
        historico.add(getValor()); // Adiciona o novo valor ao histórico
    }

    public List<Integer> getHistorico() {
        return historico;
    }
}
