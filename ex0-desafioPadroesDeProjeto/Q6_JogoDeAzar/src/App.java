// App.java
public class App {
    public static void main(String[] args) {
        // 1. Usando o Dado Simples (sem decorator)
        IDado d6 = new DadoSimples(6);
        d6.rolar();
        System.out.println("D6 Simples - Última jogada: " + d6.getValor());

        System.out.println("-------------------------");

        // 2. Usando o Dado com Histórico (Decorator)
        // Criamos um dado de 20 lados e o "envelopamos" com o decorator de histórico
        IDado d20Simples = new DadoSimples(20);
        DadoComHistorico d20 = new DadoComHistorico(d20Simples);

        // Rolando o dado decorado várias vezes
        d20.rolar();
        d20.rolar();
        d20.rolar();
        d20.rolar();

        System.out.println("D20 Decorado - Última jogada: " + d20.getValor());
        System.out.println("D20 Decorado - Histórico de jogadas: " + d20.getHistorico());
    }
}
