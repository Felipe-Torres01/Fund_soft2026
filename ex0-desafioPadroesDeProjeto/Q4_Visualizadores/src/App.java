import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var cm = new VisualizadorDeMedia(dados.getValores());
        var cs = new VisualizadorDeSomatorio(dados.getValores());

        // Inscrevendo os visualizadores (ativando-os)
        dados.inscreve(cm);
        dados.inscreve(cs);

        Scanner s = new Scanner(System.in);
        int valor = 0;
        while(true){
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            valor = Integer.parseInt(s.nextLine());
            if (valor == 0){
                break;
            }

            // Apenas adicionamos o dado; o Observer faz o resto
            dados.add(valor);
        }
        System.out.println("Fim");
        s.close();
    }
}
