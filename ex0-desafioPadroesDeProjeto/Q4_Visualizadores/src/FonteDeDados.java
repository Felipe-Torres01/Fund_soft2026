import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados {
    private List<Integer> lst;
    private List<Observador> observadores; // Lista de inscritos

    public FonteDeDados(){
        lst = new LinkedList<>();
        observadores = new ArrayList<>();
    }

    // Métodos para gerenciar a ativação/desativação de visualizadores
    public void inscreve(Observador obs) {
        observadores.add(obs);
    }

    public void desinscreve(Observador obs) {
        observadores.remove(obs);
    }

    private void notifica(Integer valor) {
        for (Observador obs : observadores) {
            obs.atualiza(valor);
        }
    }

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notifica(value); // Notifica todos automaticamente
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}
