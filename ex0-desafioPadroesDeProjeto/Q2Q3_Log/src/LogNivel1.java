public class LogNivel1 implements ILog{
    private ILog nivel1;

    public LogNivel1(ILog nivel1){
        this.nivel1 = nivel1;
    }

    public void log(String m){
        String AddNivel1 = ("nivel 1 " + m);
        this.nivel1.log(AddNivel1);
    }
}
