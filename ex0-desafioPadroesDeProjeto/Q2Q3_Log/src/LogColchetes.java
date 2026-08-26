public class LogColchetes implements ILog{
    private ILog logColchetes; //boneca menor vai ficar guardada aqui

    public LogColchetes(ILog msm){
        this.logColchetes = msm;//construtor ligar oque recebi por parametro com oque estou usando na classe
    }

    public void log(String m){
        String Addcolchetes = "[" + m + "]"; //tranforma colocando os colchetes
        this.logColchetes.log(Addcolchetes); //peha a boneca menor e usa ela com os colchetes 
    }
}
