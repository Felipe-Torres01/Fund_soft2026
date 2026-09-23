public class App {
    public static void main(String[] args) throws Exception {
        String email = "bernardo.copstein@pucrs.br";

        Validador validador = new Validador(new ValidaEmail());

        if (validador.valida(email)) {
            System.out.println(email + " é um email válido!");
        } else {
            System.out.println(email + " não é um email válido!");
        }
    }
}
