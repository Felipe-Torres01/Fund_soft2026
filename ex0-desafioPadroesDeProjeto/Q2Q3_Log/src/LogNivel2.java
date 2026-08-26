public class LogNivel1 implements ILog{
    private ILog nivel2;

    public LogNivel1(ILog nivel2){
        this.nivel2 = nivel2;
    }

    public void log(String m){
        String AddNivel2 = ("nivel 2 " + m);
        this.nivel1.log(AddNivel2);
    }
}
