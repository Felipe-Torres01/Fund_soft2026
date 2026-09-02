public class App {
    public static void main(String[] args) throws Exception {

        LogSimples logBase = LogSimples.getInstance();

        ILog logAlerta = new LogUpper(new LogColchetes(new LogNivel1(logBase)));

        logAlerta.log("Mensagem de alerta 1");
        logAlerta.log("Mensagem de alarme 23");

        ILog logPanico = new LogUpper(new LogNivel2(logBase));
        logPanico.log("Mensagem de panico");

        for (String m : LogSimples.getInstance()) {
            System.out.println(m);
        }
    }
}
