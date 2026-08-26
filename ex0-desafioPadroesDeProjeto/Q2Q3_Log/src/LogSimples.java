import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LogSimples implements Iterable<String>{
    private List<String> mensagens;

    private LogSimples(){ //privado para que outras classes nao possam dar new nela
        mensagens = new LinkedList<>();
    }

    private static LogSimples instancia;

    public static LogSimples getInstance(){
        if(instancia == null){

            instancia = new LogSimples();
            return instancia;
            
            }else{ return instancia;}

    }

    public void log(String m){
        String logM = LocalDate.now().toString() + " : " + m;
        mensagens.add(logM);
    }

    @Override
    public Iterator<String> iterator() {
        return mensagens.iterator();
    }
}
