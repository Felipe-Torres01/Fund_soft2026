// DadoDecorator.java
public abstract class DadoDecorator implements IDado {
    protected IDado dadoDecorado;

    public DadoDecorator(IDado dado) {
        this.dadoDecorado = dado;
    }

    @Override
    public void rolar() {
        dadoDecorado.rolar();
    }

    @Override
    public int getValor() {
        return dadoDecorado.getValor();
    }
}
