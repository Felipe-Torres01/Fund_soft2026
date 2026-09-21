public class Validador{
    private PadraoStrategy strategy;

    public Validador(PadraoStrategy strategy){
        this.strategy = strategy;
    }
    public void setStrategy(PadraoStrategy strategy){
        this.strategy = strategy;
}

    public boolean valida(String valor){
        return strategy.valida(valor);
    }
}

