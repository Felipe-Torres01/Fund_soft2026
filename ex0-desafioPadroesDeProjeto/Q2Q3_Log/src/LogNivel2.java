public class LogNivel2 implements ILog{
    private ILog nivel2;

    public LogNivel2(ILog nivel2){
        this.nivel2 = nivel2;
    }

    public void log(String m){
        String AddNivel2 = ("nivel 2 " + m);
        this.nivel2.log(AddNivel2);
    }
}
