public interface PadraoStrategy {
    boolean valida(String valor);
}

class ValidaInteiro implements PadraoStrategy {
    @Override
    public boolean valida(String valor) {
        for(int i = 0; i < valor.length(); i++) {
            if(!Character.isDigit(valor.charAt(i))) {
                return false;
            }
        }
        return true;
    }
} // Chave de fechamento adicionada aqui

class ValidaMatricula implements PadraoStrategy {
    private PadraoStrategy validadorInteiro = new ValidaInteiro();

    @Override
    public boolean valida(String valor) {
        // Correção: acessando o método .valida() do objeto instanciado
        if(!validadorInteiro.valida(valor)) {
            return false;
        }
        int sum = 0;
        for(int i = 0; i < valor.length() - 1; i++) {
            sum += Character.getNumericValue(valor.charAt(i));
        }
        int verificador = sum % 10;
        return verificador == Character.getNumericValue(valor.charAt(valor.length() - 1));
    }
}

class ValidaEmail implements PadraoStrategy {
    @Override
    public boolean valida(String valor) {
        int posA = valor.indexOf('@');
        int posPt = valor.indexOf('.');
        return posA > 0 && posPt > 0;
    }
}
