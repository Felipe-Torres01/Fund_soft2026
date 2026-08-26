public class LogUpper implements ILog{
    private ILog logUpper;

    public LogUpper(ILog logUpper){
        this.logUpper = logUpper;
    }
    public void log(String m){
        String AddUpper = m.toUpperCase();
        this.logUpper.log(AddUpper);
    }
}
